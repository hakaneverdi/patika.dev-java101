import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // calculating for the entered number
        double harmonicSeries = 0;
        for (int i = 1; i <= number; i++) {
            harmonicSeries += (double) 1 / i;
        }

        System.out.println("Harmonic Series: " + harmonicSeries);
    }
}
