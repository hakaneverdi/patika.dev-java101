import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int math, physics, chemistry, turkish, history, music;
        
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter your Math grade:");
        math = inp.nextInt();

        System.out.println("Enter your Physics grade:");
        physics = inp.nextInt();

        System.out.println("Enter your Chemistry grade:");
        chemistry = inp.nextInt();

        System.out.println("Enter your Turkish grade");
        turkish = inp.nextInt();

        System.out.println("Enter your History grade");
        history = inp.nextInt();

        System.out.println("Enter your Music grade");
        music = inp.nextInt();

        // calculate average grade
        double average = (math + physics + chemistry + turkish + history + music) / 6;

        System.out.println("Your average grade is:" + average);
        
        String result = (average >= 60) ? "Passed the Class" : "Failed the Class";
        System.out.println(result);
    }
}
