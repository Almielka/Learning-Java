package JavaSyntax;

/**
 * @author Anna S. Almielka
 */

/**
 * Multiplication table
 *
 * Display a 10 x 10 multiplication table in the following form:
 * 1 2 3 4 …
 * 2 4 6 8 …
 * 3 6 9 12 …
 * 4 8 12 16 …
 * …
 *
 * Requirements:
 * 1.	The program should output text.
 * 2.	The displayed text should contain 10 lines.
 * 3.	Each displayed string must contain 10 numbers separated by spaces.
 * 4.	The displayed numbers must form a multiplication table.
 */

public class MultiplicationTable {

    public static void main(String[] args) {
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            int b = 2;
            while (b <= 10) {
                System.out.print(a * b + " ");
                b++;
            }
            System.out.println();
            a++;
        }
    }

}
