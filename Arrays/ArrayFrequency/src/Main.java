import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Frequency of Element: ");
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            // control for same elements
            boolean isCounted = false;
            for(int k = 0; k < i; k++){
                if(array[k] == array[i]){
                    isCounted = true;
                    break;
                }
            }
            if(!isCounted){
                System.out.println("Element: " + array[i] + ", Frequency: " + count);
            }
        }
    }
}
