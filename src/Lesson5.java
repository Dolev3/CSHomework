import java.util.*;

public class Lesson5 {

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
//        circle();
//        triangle();
//        randomize();
//        dice();
//        letterRand();
    }

    public static void circle() {
        System.out.println("Enter radius");
        double rad = sc.nextDouble();
        double perimeter = rad * Math.PI * 2;
        double area = Math.pow(rad, 2) * Math.PI;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

    public static void triangle() {
        System.out.println("Enter triangle side: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter another triangle side: ");
        double side2 = sc.nextDouble();
        double hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        double area = (side1 * side2) / 2;
        System.out.println("The hypot is: " + hypot);
        System.out.println("Area is: " + area);
    }

    public static void randomize() {
        System.out.println("Enter num");
        double num1 = sc.nextDouble();
        System.out.println("Enter another num");
        double num2 = sc.nextDouble();
        double max = Math.max(num1, num2);
        double min = Math.min(num1 , num2);
        System.out.println("Randomized between "+ min + " and " + max + " is: " + (min + rand.nextDouble(max - min )));
    }

    public static void dice() {
        int min = 1;
        int max = 6;
        System.out.println(min  + rand.nextInt(max -min +1));
    }

    public static void letterRand() {
        int min = 'a';
        int max = 'z';
        System.out.println((char)(min+ rand.nextInt(max-min+1)));
    }
}
