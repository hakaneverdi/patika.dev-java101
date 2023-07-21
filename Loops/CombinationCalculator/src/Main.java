import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = scanner.nextInt();

        System.out.print("Enter r value: ");
        int r = scanner.nextInt();

        // calculate factorial of n
        int factorialN = 1;
        for (int i = 1; i <= n; i++) {
            factorialN *= i;
        }

        // calculate factorial of r
        int factorialR = 1;
        for (int i = 1; i <= r; i++) {
            factorialR *= i;
        }

        // calculate factorial of (n-r)
        int factorialNR = 1;
        for (int i = 1; i <= (n - r); i++) {
            factorialNR *= i;
        }

        // calculate combination
        int combination = factorialN / (factorialR * factorialNR);

        System.out.println("C(" + n + ", " + r + ") = " + combination);
    }
}
