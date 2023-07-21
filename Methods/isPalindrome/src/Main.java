import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        if(isPalindrome(num))
            System.out.println(num + " is a palindrome number.");
        else
            System.out.println(num + " is not a palindrome number.");
    }

    public static boolean isPalindrome(int num) {
        int reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        // reversing the number
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // checking it is palindrome
        return originalInteger == reversedInteger;
    }
}
