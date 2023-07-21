public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++){

            int j;
                        
            // checking if i is divisible by any number less the itself
            for (j = 2; j < i; j++ ){

                // if i is divisible by j, it's not prime, break the loop
                if (i % j == 0){
                    break;
                }
            }

            // if the loop is not broken, i is a prime number
            if (j == i){
                System.out.println(i);
            }

        }
    }
}
