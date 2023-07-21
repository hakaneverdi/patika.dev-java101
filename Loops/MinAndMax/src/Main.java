import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter: ");
        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // loop for each number 
        for (int i = 1; i <= n; i++ ){
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();

            // checking entered number is greater than current maximum
            if(num > max){
                max = num;  // update maximum
            }

            // checking entered number is smaller than current minimum
            if (num < min){
                min = num;  // update minimum
            }

        }

        // Print out maximum and minimum numbers
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
