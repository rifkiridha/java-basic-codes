import java.util.Scanner;

// Simple code to generate factorial from given input of integer
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input postive integers : ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = (i + 1) * result;
        }
        System.out.println("The value of " + n + "! is " + result);
    }
}
