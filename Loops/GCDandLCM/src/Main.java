import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number N1:");
        int num1 = input.nextInt();

        System.out.print("Number N2:");
        int num2 = input.nextInt();

        // store the original numbers
        int originalNum1 = num1;
        int originalNum2 = num2;

        // GCD (Greatest Common Divisor)
        while(num1 != num2) {
            if(num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        int gcd = num1;  // last number between num1 and num2
        System.out.println("GCD:" + gcd);

        // LCM (Least Common Multiple)
        int lcm = (originalNum1 * originalNum2) / gcd;
        System.out.println("LCM: " + lcm);
    }
}
