import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int temperature;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature:");
        temperature = input.nextInt();

        // temperature-dependent activity suggestion
        if (temperature <= 5){
            System.out.print("You can go skiing.");
        } else if (temperature < 10) {
            System.out.println("You can go to the cinema.");
        } else if (temperature <= 15) {
            System.out.println("You can go to the cinema or have a picnic.");
        } else if (temperature <= 25) {
            System.out.println("You can have a picnic.");
        }else {
            System.out.println("You can go swimming.");
        }
    }
}
