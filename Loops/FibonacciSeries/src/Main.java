import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci sequence elements: ");
        int numberOfElements = scanner.nextInt();

        System.out.println("Fibonacci Sequence:");
        int fib1 = 0, fib2 = 1;
        System.out.print(fib1 + " " + fib2 + " ");

            // generating sequence up to the requested number of elements
        for (int i = 2; i < numberOfElements; i++) {
            int fib3 = fib1 + fib2;
            System.out.print(fib3 + " ");
            fib1 = fib2;  // second number becomes first for next pair
            fib2 = fib3;  // calculated number becomes second for next pair
        }
    }
}
