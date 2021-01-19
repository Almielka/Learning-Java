package JavaSyntax;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Anna S. Almielka
 */

/**
 * Maximum of four numbers
 *
 * Use the keyboard to enter four numbers, and display the maximum of them.
 * If the numbers are equal to each other, display any of them.
 *
 * Requirements:
 * 1.	The program should read the numbers from the keyboard.
 * 2.	The program must display a number on the screen.
 * 3.	The program should display the maximum of four numbers.
 * 4.	If there are several maximum numbers, display any of them.
 */

public class MaxOfFourNumbers {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        System.out.println(max(a, b, c, d));

    }

    public static int max(int a, int b, int c, int d) {
        return (max(max(a, b), max(c, d)));
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

}
