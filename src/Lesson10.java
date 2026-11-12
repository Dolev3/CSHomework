import java.util.Random;
import java.util.Scanner;

public class Lesson10 {

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
//        wage();
//        passer();
//        square();
        triangle();
    }

    public static void wage() {
        double wage = 0;
        double hours = 0;
        double totalPay = 0;
        int count = 0;
        while (wage != -999 && hours != -999) {
            System.out.println("Enter the working hours of worker " + (count+1));
            hours = sc.nextInt();
            if (hours == -999) {
                break;
            }
            System.out.println("Enter the wage of worker " + (count+1));
            wage = sc.nextInt();
            totalPay += hours * wage;
            if (hours > 150) {
                totalPay += 250;
            }
            count++;
        }
        if (count == 0) {
            System.out.println("No workers were registered");
        } else {
            System.out.println("The bosses total pay is: " + totalPay);
            double avg = totalPay / count;
            System.out.println("Workers average pay is: " + avg);
        }
    }

    public static void passer() {
        int num;
        int total = 0;
        int count = 0;
        while (total < 100) {
            System.out.println("Enter a num: ");
            num = sc.nextInt();
            total += num;
            if (num > 0) {
                count++;
                System.out.println("Num is " + num);
            }
            if (count == 10) {
                break;
            }
        }
        System.out.println("Total is: " + total);
    }

    public static void square() {
        int n = 0;
        int total = 0;
        System.out.println("Enter the limit");
        int limit = sc.nextInt();
        while (total + Math.pow(n+1, 2) <= limit) {
            n++;
            total += (int) Math.pow(n,2);
            System.out.println("Total is " + total);
            if (total + Math.pow(n+1, 2) >= limit) {
                System.out.println("Loop is over because the next total is: " + ((int)(total + (Math.pow(n+1,2)))) + " and the limit is: " + limit);
            }
        }
        System.out.println(n + " is");
    }

    public static void  triangle() {
        
    }

}
