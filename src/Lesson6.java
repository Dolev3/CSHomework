import java.util.*;

public class Lesson6 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        elseIfEx();
//        positiveOrNeg();

    }


    public static void elseIfEx() {
        System.out.println("Enter a num");
        int num1 = sc.nextInt();
        System.out.println("Enter another num");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is bigger and " + num2 +  " is smaller");
        } else if (num1 == num2) {
            System.out.println("Both numbers " + num1 + " and " + num2 + " are equal");
        }
        else {
            System.out.println(num2 + " is bigger and " + num1 +  " is smaller");
        }
    }

    public static void positiveOrNeg() {
        System.out.println("Enter a num");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println(num + " is positive");
        else if (num < 0)
            System.out.println(num + " is negative");
        else
            System.out.println(num + " is equal to zero");
    }

    public static void biggest() {
        System.out.println("Enter 3 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Biggest is: " + num1);
            if (num2 > num3) {
                System.out.println("Middle is: " + num2);
                System.out.println("Smallest is: " + num3);
            } else if (num3 > num2) {
                System.out.println("Middle is: " + num3);
                System.out.println("Smallest is: " + num2 );
            }
        }
    }
}
