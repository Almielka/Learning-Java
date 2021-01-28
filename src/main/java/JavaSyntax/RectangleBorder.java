package JavaSyntax;

/**
 * @author Anna S. Almielka
 */

import java.util.Scanner;

/**
 * task0436additional.Drawing a rectangle
 * <p>
 * Use the keyboard to enter two numbers m and n.
 * Using a for loop, display an n x m rectangle border made of stars.
 * Here's an example: m=3, n=4
 * ****
 * *  *
 * ****
 */

public class RectangleBorder {
    public static void main(String[] args) {
        System.out.println("Enter the desired height of the rectangle:");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        System.out.println("Enter the desired length of the rectangle:");
        int length = sc.nextInt();

        if (height > 0 && length > 0) {

            for (int i = 0; i < height; i++) {

                if (i == 0 || i == height - 1) { // for the first and last line, create a loop with only stars
                    for (int j = 0; j < length; j++) {
                        System.out.print("*");
                    }
                    System.out.println(); // in the first and last line, so we switch the line
                    continue; //and finish the iteration
                }

                System.out.print("*"); // star, first in line

                for (int j = 0; j < (length - 2); j++) { // draw spaces, length minus 2 extreme ones, where we have stars
                    System.out.print(" ");
                }

                System.out.print("*"); //star, last in line

                System.out.println();
            }

        } else {
            System.out.println("You entered incorrect values!");
        }

    }
}

