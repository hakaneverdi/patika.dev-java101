import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number:");
        int number = scanner.nextInt();


        int sum = 0;
        while(number != 0){
            int digit = number % 10; // last digit of the number
            sum += digit; // add the digit to the sum
            number /= 10; // remove last digit from the number
        }

        System.out.println("Sum of the digits: " + sum);
    }
}
