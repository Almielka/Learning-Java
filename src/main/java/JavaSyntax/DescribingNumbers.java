package JavaSyntax;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Anna S. Almielka
 */

/**
 * task0427.Describing numbers
 * <p>
 * Enter an integer from the keyboard in the range 1 - 999. Display a string description as follows:
 * "even single-digit number" - if the number is even and has one digit,
 * "odd single-digit number" - if the number is odd and has one digit,
 * "even two-digit number" - if the number is even and has two digits,
 * "odd two-digit number" - if the number is odd and has two digits,
 * "even three-digit number" - if the number is even and has three digits,
 * "odd three-digit number" - if the number is odd and has three digits.
 * If the entered number does not fall in the range 1 - 999, don't display anything.
 * Example for 100:
 * even three-digit number
 * Example for 51:
 * odd two-digit number
 */
public class DescribingNumbers {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder str = new StringBuilder();
        if (n > 0 && n < 1000) {
            if (n % 2 == 0) str.append("even ");
            else str.append("odd ");
            if (n < 10)
                str.append("single-digit ");
            if (n >= 10 && n < 100)
                str.append("two-digit ");
            if (n >= 100)
                str.append("three-digit ");
            System.out.println(str.append("number").toString());
        }
    }

}
