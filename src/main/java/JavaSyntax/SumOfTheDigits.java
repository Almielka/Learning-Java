package JavaSyntax;

/**
 * @author Anna S. Almielka
 */

/**
 * task0132.Sum of the digits of a three-digit number
 * <p>
 * Write the code for sumDigitsInNumber(int number). The method takes a three-digit whole number.
 * You need to calculate the sum of the digits of this number, and then return the result.
 * Consider this example:
 * The sumDigitsInNumber method is called with the argument 546.
 * Example output:
 * 15
 */

public class SumOfTheDigits {

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        return number / 100 + number % 100 / 10 + number % 100 % 10;
    }

}
