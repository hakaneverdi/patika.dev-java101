import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array Size n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        //insert the elements by loop
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". element: ");
            array[i] = scanner.nextInt();
        }

        // sorting array
        Arrays.sort(array);

        //printing
        System.out.println("Sorted: " + Arrays.toString(array));

    }
}
