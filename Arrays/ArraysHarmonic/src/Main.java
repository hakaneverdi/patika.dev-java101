public class Main {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double harmonicSum = 0;

        //harmonic calculation
        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1 / numbers[i];
        }

        //harmonic formula
        System.out.println(numbers.length / harmonicSum );
    }
}