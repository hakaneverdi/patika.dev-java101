import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int distanceInKm;
        double costPerKm = 2.20, totalCost, startPrice = 10;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the distance to be traveled (in km) :");
        distanceInKm = input.nextInt();

        // calculate total cost
        totalCost = (distanceInKm * costPerKm);
        totalCost += startPrice;

        // check totalCost
        totalCost = (totalCost < 20) ? 20 : totalCost;
        
        System.out.print("Total cost is: " + totalCost);

    }
}
