import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "12345"; // example of correct password

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();
        
        if (enteredPassword.equals(correctPassword)) {
            System.out.print("Entered password is correct. Welcome to the program!");
        } else {
            System.out.print("Entered password is incorrect. Would you like to reset your password? (yes/no): ");
            String response = scanner.nextLine();

            
            if (response.equalsIgnoreCase("yes")) {
                System.out.print("Enter your new password: ");
                String newPassword = scanner.nextLine();
                
                // check the new password 
                if (newPassword.equals(enteredPassword) || newPassword.equals(correctPassword)) {
                    System.out.println("Password could not be created, please enter a different password.");
                } else {
                    System.out.println("Password created.");
                    correctPassword = newPassword;
                }
            } else {
                System.out.println("Password reset operation has been cancelled.");
            }
        }
    }
}
