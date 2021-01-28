package JavaSyntax;

import java.util.Scanner;

/**
 * @author Anna S. Almielka
 */


/**
 * task0437additional.Equilateral triangle of stars or Christmas Tree :)
 * <p>
 * Using a for loop, display a right triangle of stars, like an equilateral triangle
 * Example output:
 *    *
 *   ***
 *  *****
 * *******
 */
public class TriangleEquilateral {

    public static void main(String[] args) {
        System.out.println("Enter the desired height of the equilateral triangle:");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        if (height > 0) {
            int n = 1;
            for (int i = 0; i < height; i++) {
                for (int j = height - 1; j > i; j--) {
                    System.out.print(" "); // gaps
                }
                for (int m = 0; m < n; m++) {
                    System.out.print("*"); // stars
                }
                n += 2;
                System.out.println();
            }
        } else {
            System.out.println("You entered incorrect values!");
        }
    }

}
