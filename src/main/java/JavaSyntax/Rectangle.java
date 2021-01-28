package JavaSyntax;

/**
 * @author Anna S. Almielka
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * task0436.Drawing a rectangle
 *
 * Use the keyboard to enter two numbers m and n.
 * Using a for loop, display an n x m rectangle made of eights.
 * Here's an example: m=2, n=4
 * 8888
 * 8888
 */

public class Rectangle {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int m = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("8");
                }
                System.out.println();
            }
        }
    }

}
