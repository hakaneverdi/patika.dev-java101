import java.util.Scanner;

public class Main {
    static void pattern(int N){
        System.out.printf(N + " ");

        if (N <= 0)return; //returns to the point where it was called.

        pattern(N-5);

        System.out.printf(N + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N number:");
        int N = scanner.nextInt();
        pattern(N);
    }
}