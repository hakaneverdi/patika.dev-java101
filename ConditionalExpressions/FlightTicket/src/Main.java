import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int distance, age, tripType;
        double price;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance (in KM):");
        distance = scanner.nextInt();

        System.out.println("Enter your age:");
        age = scanner.nextInt();

        System.out.println("Enter trip type (1: One-Way, 2: Round-Trip):");
        tripType = scanner.nextInt();

        // check the input values are valid
        if(age > 0 && distance > 0 && (tripType == 1 || tripType == 2)){
            price = distance * 0.10;

            // age discount
            if (age < 12) {
                price *= 0.5; // %50 discount
            } else if (age <= 24) {
                price *= 0.9; // %10 discount
            } else if (age >= 65) {
                price *= 0.7; // %30 discount
            }

            // trip type discount
            if (tripType == 2) {
                price *= 0.8 * 2; // %20 discount
            }
            System.out.println("Total Price: " + price + " TL");

        }else {
            System.out.println("Invalid data entered!");
        }
    }
}
