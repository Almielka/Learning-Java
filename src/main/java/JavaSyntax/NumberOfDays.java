package JavaSyntax;

/**
 * @author Anna S. Almielka
 */

import java.util.Scanner;

/**
 * Number of days in the year
 * <p>
 * Use the keyboard to enter a year, and then determine the number of days in the year.
 * Display the result as follows:
 * "Number of days in the year: x", where x is 366 for a leap year, and x is 365 for an ordinary year.
 * <p>
 * Hint: A leap year is 366 days, but an ordinary year is 365 days.
 * 1) if the year is evenly divisible by 400, then it is a leap year;
 * 2) for other years, if the year is evenly divisible by 100, then it is a regular year;
 * 3) for other years, if the year is evenly divisible by 4, then it is a leap year;
 * 4) all remaining years are not leap years.
 * Thus, the years 1700, 1800, and 1900 are not leap years, since they are multiples of 100 but not 400.
 * The years 1600 and 2000 are leap years, since they are multiples of 100 and multiples of 400.
 * The years 2100, 2200 and 2300 are not leap years.
 */

public class NumberOfDays {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        isLeap(year);
    }

    public static void isLeap(int year) {
        int days;
        if (year % 400 == 0) {
            days = 366;
        } else if (year % 100 == 0) {
            days = 365;
        } else if (year % 4 == 0) {
            days = 366;
        } else days = 365;
        System.out.println("Number of days in the year: " + days);
    }

}
