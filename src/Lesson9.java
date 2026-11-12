import java.util.Random;
import java.util.Scanner;

public class Lesson9 {

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
//        ex1();
//        grade();
        ex2();
    }

    public static void ex1() {
        int num = 100 + rand.nextInt(101);
        int i = 0;
        while (i + 2 <= num) {
            i += 3;
            System.out.println(i);
        }
        System.out.println("Random num is: " + num);
    }

    public static void grade() {
        int count = -1;
        double grade = 0;
        double highest = 0;
        double totalGrade = 0;
        while (grade >= 0) {
            totalGrade += grade;
            count++;
            System.out.println("Enter a grade");
            grade = sc.nextInt();
            if (grade > highest) {
                highest = grade;
            }
        }
        if (count == 0) {
            System.out.println("No grades were entered");
        } else {
            System.out.println("The number of grades is: " + count);
            double gradeAvg = totalGrade / count;
            System.out.println("The average grade is: " + gradeAvg);
            System.out.println("The highest grade is: " + highest);
        }
    }

    public static void ex2() {
        int num = 0;
        int total = 1;
        while (num != -1) {
            System.out.println("Enter a num");
            num = sc.nextInt();
            if (num % 2 == 0 && num % 3 == 0) {
                total *= num;
            }
        }
        System.out.println("Total multiplication: " + total);
    }

}

