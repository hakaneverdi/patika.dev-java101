import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName, password;
        int attemptsLeft = 3;
        int balance = 1500;
        int choice;

        // user login loop
        while(attemptsLeft > 0 ){
            System.out.println("Username:");
            userName = scanner.nextLine();
            System.out.println("Password:");
            password = scanner.nextLine();

            // if login is successful
            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Welcome to Kodluyoruz Bank.");

                // user operation loop
                do {
                    System.out.println("1-Deposit Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Check Balance\n" +
                            "4-Logout");
                    System.out.print("Select an operation: ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Amount of money: ");
                            int amount = scanner.nextInt();
                            balance += amount;
                            break;
                        case 2:
                            System.out.println("Amount of money: ");
                            amount = scanner.nextInt();
                            balance -= amount;
                            break;
                        case 3:
                            System.out.println("Balance: " + balance);
                            break;
                        default:
                            if (choice !=4){
                                System.out.println("Invalid input.");
                                break;
                            }
                    }
                }while (choice !=4);  // loop until choosing logout
                System.out.println("See you again.");
                break;

                // if login is unsuccessful
            }else {
                attemptsLeft--;
                System.out.println("Invalid username or password. Please try again.");
                if (attemptsLeft == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Attempts left: " + attemptsLeft);
                }

            }

        }
    }
}
