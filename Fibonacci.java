import java.util.Scanner;

// Simple Java codes to output Fibonacci numbers with if else and for loop

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (!(n >= 1)) {
            System.out.println("Invalid input");
        } else {
            int a1 = 1, a2 = 1, a3;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.println("Deret ke-1 : " + a1);
                } else if (i == 1) {
                    System.out.println("Deret ke-2 : " + a2);
                } else {
                    a3 = a1 + a2;
                    System.out.println("Deret ke-" + (i + 1) + " : " + a3);
                    a1 = a2;
                    a2 = a3;
                }
            }
        }
    }
}