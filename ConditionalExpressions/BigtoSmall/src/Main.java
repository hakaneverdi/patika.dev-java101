import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, number3;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        number1 = input.nextInt();

        System.out.println("Enter the 2nd number:");
        number2 = input.nextInt();

        System.out.println("Enter the 3rd number:");
        number3 = input.nextInt();

        // compare the numbers
        if((number1 > number2) && (number1 > number3)){
            if(number2 > number3)
                System.out.println("number1 > number2 > number3");
            else
                System.out.println("number1 > number3 > number2");
        } else if ((number2 > number1) && (number2 > number3)) {
            if(number1 > number3)
                System.out.println("number2 > number1 > number3");
            else
                System.out.println("number2 > number3 > number1");
        } else {
            if(number1 > number2)
                System.out.println("number3 > number1 > number2");
            else
                System.out.println("number3 > number2 > number1");
        }
    }
}
