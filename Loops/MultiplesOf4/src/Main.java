import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;
        
        do{
            System.out.println("Enter a number:");
            number = scanner.nextInt();

            // if the number is divisible by 4, add it to the total
            if(number % 4 == 0) {
                total += number;
            }

        } while(number % 2 != 1); // continue until an odd number is entered

        System.out.println("Total: " + total);
    }
}
