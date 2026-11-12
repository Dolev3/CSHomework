import java.util.Random;
import java.util.Scanner;

public class Lesson12 {

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
//        grade();
//        garage();
//        savings();
        extra();
    }

    public static void grade() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Enter a grade");
        int grade = sc.nextInt();
        while (grade != -1) {
            if (grade > max) {
                max = grade;
            }
            if (grade < min) {
                min = grade;
            }
            System.out.println("Enter another grade");
            grade = sc.nextInt();
        }
        System.out.println("Max grade: " + max);
        System.out.println("Min grade: " + min);
    }

    public static void garage() {
        System.out.println("Enter entry hour");
        int entryHour = sc.nextInt();
        System.out.println("Enter exit hour");
        int exitHour = sc.nextInt();
        int priceToPay = 0;
        int hourDif = exitHour - entryHour;
        int lotto = 1 + rand.nextInt(10);
        if (hourDif < 0) {
            System.out.println("Illegal hours");
        } else {
            if (hourDif == 0) {
                priceToPay = 12;
                hourDif = 1;
            } else {
                priceToPay = 12 + (hourDif-1)*8;
            }
            priceToPay = Math.min(priceToPay, 60);
            System.out.println("Hours: " + hourDif);
            System.out.println("Price: " + priceToPay);
            System.out.println("Lottery result: " + lotto);
            if (lotto >= 7 && lotto <= 9) {
                priceToPay /= 2;
                System.out.println("50 precent discount");
            } else if (lotto == 10) {
                priceToPay = 0;
                System.out.println("Free parking");
            }
            System.out.println("Price to pay: " + priceToPay);
        }
    }

    public static void savings() {
        int highestWeek = Integer.MIN_VALUE;
        int count = 0;
        int greatCount = 0;
        int higherCount = 0;
        int totalSavings = 0;
        int lastWeek = Integer.MAX_VALUE;
        int whichWeekHighest = 0;

        System.out.println("Enter this weeks saving");
        int saved = sc.nextInt();
        while (saved != -1) {
            if (saved < 0) {
                System.out.println("Illegal saving, week skipped");
            } else {
                count++;
                totalSavings += saved;
                if (saved > highestWeek) {
                    highestWeek = saved;
                    whichWeekHighest = count;
                }
                if (saved >= 50) {
                    System.out.println("Great week");
                    greatCount++;
                }
                if (saved > lastWeek) {
                    higherCount++;
                }
                lastWeek = saved;
            }
            System.out.println("Enter another week");
            saved = sc.nextInt();
        }
        double avgSavings = (double)totalSavings/count;
        double greatPercentage = (double) greatCount * (100/(double)count);
        System.out.println("Weeks " + count);
        System.out.println("Total saved " + totalSavings);
        System.out.println("Great weeks " + greatCount);
        System.out.println("Average week " + avgSavings);
        System.out.println("Great percentage " + greatPercentage);
        System.out.println("Most saved " + highestWeek + " in week " + whichWeekHighest);
        System.out.println("More than last week " + higherCount);
    }

    public static void extra() {
        System.out.println("Enter num");
        long num = sc.nextLong();
        long total = 0;
        while (num != 0) {
            total += num%10;
            num /= 10;
        }
        System.out.println("Total " + total);
    }

}
