package JavaSyntax;

/**
 * @author Anna S. Almielka
 */

/**
 * Closest to 10
 * <p>
 * Write the displayClosestToTen method.
 * The method should display the argument that is nearest to 10.
 * For example, given the numbers 8 and 11, 11 is closest to ten.
 * If both numbers are equally close to 10, then display either of them.
 * Hint: use the public static int abs(int a) method,
 * which returns the absolute value of a number.
 */

public class ClosestTo10 {

    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        if (abs(a - 10) <= abs(b - 10))
            System.out.println(a);
        else System.out.println(b);

    }

    public static int abs(int a) {
        return (a < 0) ? -a : a;
    }

}