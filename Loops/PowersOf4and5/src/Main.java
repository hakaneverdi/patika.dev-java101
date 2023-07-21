import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int counter = 0;

        // calculating powers of 4 and 5 until the entered number
        for(int i = 1, j = 1; i < number && j < number; i *=4, j *=5){
            System.out.println("4 to the power of " + counter + ": " + i);
            System.out.println("5 to the power of " + counter + ": " + j);
            counter++;
        }
    }
}
