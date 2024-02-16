import java.util.Scanner;

public class PascalTriangle {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int combinatiorial(int n, int r) {
        return (factorial(n)) / ((factorial(r)) * (factorial(n - r)));
    }

    public static void pascalSequence(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.print(combinatiorial(a, i));
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pascal Triangle's Application");
        System.out.println("Input number of lines (max 12):");
        int b = sc.nextInt();
        if (b <= 12) {
            for (int i = 0; i <= b; i++) {
                pascalSequence(i);
                System.out.println();
            }
        } else {
            System.out.println("Max line allowed is 12");
        }
    }
}
