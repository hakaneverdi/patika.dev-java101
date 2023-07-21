import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music, numberOfSubjects = 0, total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Math grade:");
        math = input.nextInt();
        if (math >= 0 && math <= 100) {
            total += math;
            numberOfSubjects++;
        }

        System.out.println("Enter your Physics grade:");
        physics = input.nextInt();
        if (physics >= 0 && physics <= 100) {
            total += physics;
            numberOfSubjects++;
        }

        System.out.println("Enter your Turkish grade:");
        turkish = input.nextInt();
        if (turkish >= 0 && turkish <= 100) {
            total += turkish;
            numberOfSubjects++;
        }

        System.out.println("Enter your Chemistry grade:");
        chemistry = input.nextInt();
        if (chemistry >= 0 && chemistry <= 100) {
            total += chemistry;
            numberOfSubjects++;
        }

        System.out.println("Enter your Music grade:");
        music = input.nextInt();
        if (music >= 0 && music <= 100) {
            total += music;
            numberOfSubjects++;
        }
        
        average = total / (double)numberOfSubjects;

        
        // checking average grade is higher or lower than 55
        if (average <= 55) {
            System.out.println("You failed.");
        } else {
            System.out.println("Congratulations! You passed the class.");
        }
        
        System.out.println("Your average grade is: " + average);
    }
}
