import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int side1, side2, side3, perimeter;
        double  semiPerimeter, area;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Length of the 1st side:");
        side1 = scanner.nextInt();
        System.out.print("Length of the 2nd side:");
        side2 = scanner.nextInt();
        System.out.print("Length of the 3rd side:");
        side3 = scanner.nextInt();

        // calculate perimeter
        perimeter = side1 + side2 + side3;

        // calculate semiPerimeter
        semiPerimeter = perimeter / 2.0;

        // calculate area using the formula
        area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        
        System.out.print("Area of the triangle: " + area);

    }
}
