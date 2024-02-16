import java.util.Scanner;

public class Combinatorial {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kalkulator kombinatorika");
        System.out.println("Mencari nilai nCr dimana nCr = (n!)/((r)!(n-r)!)");
        System.out.println("Syarat n,r adalah bilangan bulat positif dan n>=r");
        System.out.print("Masukkan nilai n :");
        int n = sc.nextInt();
        System.out.print("Masukkan nilai r : ");
        int r = sc.nextInt();

        int result = (factorial(n)) / ((factorial(r)) * (factorial(n - r)));
        System.out.println("Hasil perhitungan " + n + "C" + r + " = " + result);
    }
}
