import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double priceWithoutVAT, vatRate, vatAmount, priceWithVAT;
        
        System.out.print("Enter the price of the product:");
        Scanner scanner = new Scanner(System.in);
        priceWithoutVAT = scanner.nextDouble();
        
        // if the price is less than 1000, the VAT rate is 18%. Otherwise, the rate is 8%
        vatRate = priceWithoutVAT < 1000 ?  0.18 :  0.08;

        // calculate the VAT amount
        vatAmount = priceWithoutVAT * vatRate;

        // calculate total price with VAT
        priceWithVAT = priceWithoutVAT + vatAmount;
        
        System.out.println("Price without VAT:" + priceWithoutVAT);
        System.out.println("VAT rate:" + vatRate);
        System.out.println("VAT amount:" + vatAmount);
        System.out.println("Price with VAT: " + priceWithVAT);
    }
}
