import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of steps: ");

        int steps = scanner.nextInt();
        
        for (int i = 0; i < steps; i++){

            // leading spaces
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }

            // asterisks
            for (int k = 0; k < 2 * (steps - i) - 1; k++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }

    }
}
