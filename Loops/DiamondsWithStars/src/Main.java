import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of the diamond:");
        int height = scanner.nextInt();

        // upper part of the diamond
        for (int i = 1; i <= height; i++){

            // leading spaces
            for (int j = 1; j <= height - i; j++){
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("*");
            }

            // next line after printing each row
            System.out.println();
        }

        // bottom part of the diamond
        for (int i = height - 1; i >= 1; i--){

            // leading spaces
            for (int j = 1; j <= height - i; j++){
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("*");
            }

            // next line after printing each row
            System.out.println();
        }
    }
}
