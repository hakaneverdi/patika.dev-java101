import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = inp.nextInt();

        // default biggest and smallest
        int nearestLower = Integer.MIN_VALUE;
        int nearestHigher = Integer.MAX_VALUE;


        for (int i : numbers){

            //if it is less than the entered number and greater than the nearestLower,
            //it becomes the new nearestLower
            if (i < num && i > nearestLower){
                nearestLower = i;
            }

            //if it is greater than the entered number and less than the nearestHigher,
            //it becomes the new nearestHigher
            if (i > num && i < nearestHigher){
                nearestHigher = i;
            }
        }

        System.out.println("Nearest lower = " + nearestLower);
        System.out.println("Nearest higher = " + nearestHigher);
    }
}