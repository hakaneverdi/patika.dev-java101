import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11,
                bananaPrice = 0.95, eggplantPrice = 5.00, total;

        Scanner inp = new Scanner(System.in);

        System.out.print("How many kg pears? : ");
        pearPrice *= inp.nextDouble();

        System.out.print("How many kg apples? : ");
        applePrice *= inp.nextDouble();

        System.out.print("How many kg tomatoes? : ");
        tomatoPrice *= inp.nextDouble();

        System.out.print("How many kg bananas?:" );
        bananaPrice *= inp.nextDouble();

        System.out.print("How many kg eggplants? : ");
        eggplantPrice *= inp.nextDouble();

        // calculate total amount
        total = pearPrice + applePrice + tomatoPrice + bananaPrice + eggplantPrice;
        System.out.println("Total = " + total + " TL");
    }
}
