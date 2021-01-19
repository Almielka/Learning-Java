package JavaSyntax;

import java.util.Scanner;

/**
 * @author Anna S. Almielka
 */

public class RuleOfTheTriangle {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        isTriangle(a, b, c);

    }

    /**
     * Rule of the triangle
     * <p>
     * Use the keyboard to enter three numbers a, b, and c (the lengths of the sides of the proposed triangle).
     * Determine whether a triangle with these sides can exist. Display the result as follows:
     * "The triangle is possible." - if a triangle with these sides could exist.
     * "The triangle is not possible." - if a triangle with these sides cannot exist.
     * <p>
     * Hint: A triangle can exist only if the sum of any two of its sides is greater than the third side.
     * You need to compare each side with the sum of the other two.
     * If even one side is larger than the sum of the other two sides, then no such triangle exists.
     */
    public static void isTriangle(int a, int b, int c) {
        System.out.println("The triangle is " + ((((a + b) > c) && ((a + c) > b) && ((b + c) > a)) ? "" : "not ") + "possible.");
    }

}