import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int total = 0;

        // if number is divisible by i add to total
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                total += i;
            }
        }

        // if the total equals the input number, it is a perfect number
        if (total == number){
            System.out.println(number + " is a perfect number");
        }else {
            // if not, it is not a perfect number
            System.out.println(number + " is not a perfect number");
        }
    }
}
