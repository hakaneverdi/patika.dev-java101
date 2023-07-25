import java.util.Scanner;

public class Main {

    static double power(int base, int exponent){

        if (exponent == 0){
            //every number to the zero power is always equal to one
            return 1;
        } else if (exponent > 0) {
            return base * power(base, (exponent-1));
        }else {
            //if the exponent is negative 1/power()
            return (1 / (base * power(base, (-exponent-1))));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base value: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent value: ");
        int exponent = scanner.nextInt();

        double result = power(base, exponent);
        System.out.printf("Result: " + result);
    }


}