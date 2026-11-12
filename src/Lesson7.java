import java.util.Scanner;

public class Lesson7 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        passOrNot();
//        bank();
//        driver();
//        palindrome();
        mathGame();
    }
    public static void passOrNot() {
        System.out.println("Enter maths grade");
        int mathGrade = sc.nextInt();
        System.out.println("Enter English grade");
        int englishGrade = sc.nextInt();
        System.out.println("Enter literature grade");
        int literatureGrade = sc.nextInt();

        int mathAndEnglishAvg = (mathGrade + englishGrade) / 2;
        int gradeAvg = (mathGrade + englishGrade + literatureGrade) / 3;

        if (mathAndEnglishAvg > 80 || gradeAvg > 75) {
            System.out.println("The student passed the year");
        } else {
            System.out.println("The student failed the year");
        }
    }

    public static void bank() {
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter balance");
        double balance = sc.nextDouble();
        System.out.println("Enter is a member");
        boolean isMember = sc.nextBoolean();

        boolean bonus1 = (age > 18) && (balance > 1000);
        boolean bonus2 = (age > 21) && (balance > 2000);
        boolean bonus3 = (((age > 20) && (balance < 500)) || (!isMember));
        boolean bonus4 = (age != 21) && (balance >= 1000);
        boolean bonus5 = (age != 25) || (isMember);

        if (bonus1) {
            System.out.println("Noam is eligible for bonus 1");
        } else {
            System.out.println("Noam isn't eligible for bonus 1");
        }
        if (bonus2) {
            System.out.println("Noam is eligible for bonus 2");
        } else  {
            System.out.println("Noam isn't eligible for bonus 2");
        }
        if (bonus3) {
            System.out.println("Noam is eligible for bonus 3");
        } else {
            System.out.println("Noam isn't eligible for bonus 3");
        }
        if (bonus4) {
            System.out.println("Noam is eligible for bonus 4");
        } else {
            System.out.println("Noam isn't eligible for bonus 4");
        }
        if (bonus5) {
            System.out.println("Noam is eligible for bonus 5");
        } else {
            System.out.println("Noam isn't eligible for bonus 5");
        }
    }

    public static void driver() {
        System.out.println("Enter driver speed");
        double speed = sc.nextDouble();
        System.out.println("Enter road max speed");
        double maxSpeed = sc.nextDouble();
        System.out.println("Enter road min speed");
        double minSpeed = sc.nextDouble();
        System.out.println("Enter if the driver has a penalty");
        boolean hasPenalty = sc.nextBoolean();

        if ((speed < maxSpeed && speed > minSpeed)&&(!hasPenalty)) {
            System.out.println("Allowed");
        } else {
            System.out.println("Criminal charge");
        }
        if (speed > minSpeed || !hasPenalty ) {
            System.out.println("Allowed");
        } else {
            System.out.println("Criminal charge");
        }
        if (speed <= maxSpeed && speed >= minSpeed) {
            System.out.println("Allowed");
        } else {
            System.out.println("Criminal charge");
        }
        if ((speed == maxSpeed || speed == minSpeed)&&(!hasPenalty)) {
            System.out.println("Allowed");
        } else {
            System.out.println("Criminal charge");
        }
        if (speed > maxSpeed && hasPenalty) {
            System.out.println("Criminal charge");
        } else{
            System.out.println("Allowed");
        }
    }



    public static void mathGame() {
        
    }

}
