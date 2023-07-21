import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2;
        char operation;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        number1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        number2 = scanner.nextInt();

        // selecting operation from the user
        System.out.println("Select the operation (+ * / -):");
        operation = scanner.next().charAt(0);

        // selection according to the operation entered
        switch(operation) {
            case '+' :
                System.out.println("Result: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Result: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Result: " + (number1 * number2));
                break;
            case '/':
                if (number2 == 0)
                    System.out.println("You can't divide by zero");
                else
                    System.out.println("Result: " + (number1 / number2));
                break;
            default:
                System.out.println("You entered an incorrect value");
        }
    }
}
