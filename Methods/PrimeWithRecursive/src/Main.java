import java.util.Scanner;
public class Main {
    static boolean isPrime(int number, int divisor){

        if (number <= 1)return false;
        if (divisor >= number)return true;
        if (number % divisor == 0)return false;

        return isPrime(number, divisor+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int divisor = 2;

        if (isPrime(number,divisor)) System.out.printf(number + " is prime.");
        else System.out.printf(number + " is not prime.");
    }
}