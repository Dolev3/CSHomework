import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        bonusEncrypter();
//        time();
//        id();
//        encryption();
//        gradeAvg();
//        ATM();
        bonusEncrypter();
    }

    public static void handleBalls() {
        System.out.println("Enter the number of balls");
        int totalBalls = sc.nextInt();
        int fullBags = totalBalls / 4;
        int totalBags = (totalBalls + 3) / 4;
        int ballsLeftOut = totalBalls % 4;
        System.out.println("Full Bags: " + fullBags);
        System.out.println("Total Bags: " + totalBags);
        System.out.println("Balls left out: " + ballsLeftOut);
    }

    public static void time() {
        System.out.println("Enter time in seconds");
        Long seconds = sc.nextLong();
        int hours = (int) (seconds / 60 / 60);
        int minutes = (int) (seconds / 60 % 60);
        int secondsLeft = (int) (seconds % 60);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + secondsLeft);
    }

    public static void id() {
        System.out.println("Enter a num with 3 digits");
        int num = sc.nextInt();
        int orgNum = num;
        int digits = num % 10;
        num /= 10;
        int tens = num % 10;
        int hundreds = num / 10;
        int sum = digits + tens + hundreds;
        System.out.println("Sum: " + sum);
        int reversed = digits * 100 + tens * 10 + hundreds;
        System.out.println("Reversed: " + reversed);
        int hundredsToEnd = tens * 100 + digits * 10 + hundreds;
        System.out.println("Hundreds to end: " + hundredsToEnd);
        double avg = ((int) ((((double) digits + tens + hundreds) / 3) * 10)) / 10.0;
        System.out.println("Avg: " + avg);
    }

    public static void encryption() {
        System.out.println("Enter a lowercase letter");
        char letter = sc.next().charAt(0);
        System.out.println("Enter how much to change");
        int encryptionChange = sc.nextInt();
        char encrypted = (char) ('a' + (letter - 'a' + encryptionChange) % 26);
        int place = letter - 'a' + 1;
        char encryptedBig = (char) (encrypted - 32);
        System.out.println("Place: " + place);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Uppercase encrypted: " + encryptedBig);
        System.out.println("Encrypted code: " + (int) encrypted);
    }

    public static void gradeAvg() {
        System.out.println("Enter 3 grades");
        System.out.println("Grade 1: ");
        int grade1 = sc.nextInt();
        System.out.println("Grade 2: ");
        int grade2 = sc.nextInt();
        System.out.println("Grade 3: ");
        int grade3 = sc.nextInt();
        double exactAvg = ((double) grade1 + grade2 + grade3) / 3;
        int avg = (int) exactAvg;
        int roundedAvg = (int) (exactAvg + 0.5);
        System.out.println("Exact avg: " + exactAvg);
        System.out.println("Int avg: " + avg);
        System.out.println("Rounded avg: " + roundedAvg);
    }

    public static void ATM() {
        System.out.println("Enter amount to dispense");
        int amount = sc.nextInt();
        int tens = amount / 10;
        amount %= 10;
        int fives = amount / 5;
        amount %= 5;
        int twos = amount / 2;
        amount %= 2;
        System.out.println("Tens: " + tens);
        System.out.println("Fives: " + fives);
        System.out.println("Twos: " + twos);
        System.out.println("Ones: " + amount);
    }

    public static void bonusEncrypter() {
        System.out.println("Enter a lowercase letter: ");
        char letter = sc.next().charAt(0);
        System.out.println("Enter a triple digit num: ");
        int num = sc.nextInt();
        int change = num%26;
        char ch1 = (char) (letter - 32);
        char ch2 = (char) ('a' + (letter - 'a' + change));
        char ch3 = (char) (num / 10 % 10 + '0');
        int checkNum = ch1 + ch2 + ch3;
        char ch4 = (char)(checkNum%10 + '0');
        char ch5 = (char)((num%6) + '!');
        System.out.println("Password is: " + ch1 + "" + ch2 + "" + ch3 + "" + ch4 + "" + ch5);
    }

}
