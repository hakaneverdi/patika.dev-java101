import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int radius, centralAngle;
        double pi = 3.14, area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius of the circle :");
        radius = scanner.nextInt();

        System.out.print("Central angle for the area calculation : ");
        centralAngle = scanner.nextInt();

        // calculate the area of the sector
        area = (pi * (radius * radius) * centralAngle) / 360;

        System.out.print("Area of the sector: " + area);
    }
}
