import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double height, weight, bodyMassIndex;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight (in kg): ");
        weight = input.nextDouble();

        System.out.print("Enter your height (in m): ");
        height = input.nextDouble();

        // calculate
        bodyMassIndex = weight / (height * height);
    
        System.out.print("Your body mass index is: " + bodyMassIndex);

    }
}
