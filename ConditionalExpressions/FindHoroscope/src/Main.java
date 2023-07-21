import java.util.Scanner;

public class HoroscopeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int birthDay = scanner.nextInt();

        String zodiacSign = "";

        // calculation based on the birth month and day
        if ((birthMonth == 1 && birthDay >= 20) || (birthMonth == 2 && birthDay <= 18)) {
            zodiacSign = "Aquarius";
        } else if ((birthMonth == 2 && birthDay >= 19) || (birthMonth == 3 && birthDay <= 20)) {
            zodiacSign = "Pisces";
        } else if ((birthMonth == 3 && birthDay >= 21) || (birthMonth == 4 && birthDay <= 19)) {
            zodiacSign = "Aries";
        } else if ((birthMonth == 4 && birthDay >= 20) || (birthMonth == 5 && birthDay <= 20)) {
            zodiacSign = "Taurus";
        } else if ((birthMonth == 5 && birthDay >= 21) || (birthMonth == 6 && birthDay <= 20)) {
            zodiacSign = "Gemini";
        } else if ((birthMonth == 6 && birthDay >= 21) || (birthMonth == 7 && birthDay <= 22)) {
            zodiacSign = "Cancer";
        } else if ((birthMonth == 7 && birthDay >= 23) || (birthMonth == 8 && birthDay <= 22)) {
            zodiacSign = "Leo";
        } else if ((birthMonth == 8 && birthDay >= 23) || (birthMonth == 9 && birthDay <= 22)) {
            zodiacSign = "Virgo";
        } else if ((birthMonth == 9 && birthDay >= 23) || (birthMonth == 10 && birthDay <= 22)) {
            zodiacSign = "Libra";
        } else if ((birthMonth == 10 && birthDay >= 23) || (birthMonth == 11 && birthDay <= 21)) {
            zodiacSign = "Scorpio";
        } else if ((birthMonth == 11 && birthDay >= 22) || (birthMonth == 12 && birthDay <= 21)) {
            zodiacSign = "Sagittarius";
        } else if ((birthMonth == 12 && birthDay >= 22) || (birthMonth == 1 && birthDay <= 19)) {
            zodiacSign = "Capricorn";
        }

        System.out.println("Your zodiac sign is: " + zodiacSign);
    }
}

