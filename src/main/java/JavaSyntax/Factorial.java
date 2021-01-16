package JavaSyntax;

/**
 * @author Anna S. Almielka
 */

/**
 * Product of 10 numbers
 * <p>
 * Display the product of the 10 numbers from 1 to 10. The result is a single number.
 * Hint: it will be three million and change.
 */

public class Factorial {

    public static void main(String[] args) {
        int counter = 10;
        int factorial = 1;

        do {
            factorial *= counter--;
        } while (counter > 0);

        System.out.print(factorial);

    }

}
