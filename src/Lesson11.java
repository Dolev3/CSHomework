import java.util.Random;
import java.util.Scanner;

public class Lesson11 {

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
//        begedLi();
        pass();
    }

    public static void begedLi() {
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter num of items");
        int items = sc.nextInt();
        System.out.println("Enter total pay");
        double totalPay = sc.nextDouble();
        int disc = 0;
        double coupon = 0;
        if (totalPay >= 800) {
            disc = (int)(totalPay/400)*50;
        }
        totalPay -= disc;
        if (items >= 4) {
            coupon = totalPay * 0.25;
        }
        double avgItem = totalPay/items;
        System.out.println("Name: " + name + " total pay: " + totalPay + " average item: "  + avgItem);
        if (disc != 0) {
            System.out.println("Discount is: " + disc);
        } else {
            System.out.println("No discount");
        }
         if (coupon != 0 ) {
             System.out.println("Coupon " + coupon);
         } else {
             System.out.println("No coupon");
         }
    }

    public static void pass() {
        int num = 100 + rand.nextInt(900);
        int digits = num%10;
        int tens = digits/10%10;
        int hunds = digits/100;
        int maxDig = (Math.max(Math.max(digits, tens), hunds));
        if (num >= 200 && num <= 900) {
            if (num%2 == 0) {
                boolean isPalindrome = (digits == hunds);
                boolean divisible = (digits + tens + hunds)%3 == 0;
                boolean isSafe = !isPalindrome && divisible;
                if (isSafe) {
                    System.out.println(num + " safe, biggest digit " + maxDig);
                } else {
                    System.out.println(num + " not safe, biggest digit " + maxDig);
                }
            } else {
                System.out.println(num + " odd num, max dig " + maxDig);
            }
        } else {
            System.out.println(num + " illegal, biggest " + maxDig);
        }
    }
}
