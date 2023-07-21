public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();

        int total = 0;
        int counter = 0;

        // checking every number up to the entered number
        for (int i = 1; i <= userNumber; i++ ) {
            // checking if the number is divisible by both 3 and 4
            if((i % 3 == 0) && (i % 4 == 0)){
                total += i;
                counter++;
            }
        }
        
        if (counter > 0) {
            double average = (double) total / counter;
            System.out.println("The average of the numbers divisible by both 3 and 4: " + average);
        } else {
            System.out.println("There are no numbers divisible by both 3 and 4.");
        }
    }
}
