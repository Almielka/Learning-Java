package JavaSyntax;

/**
 * @author Anna S. Almielka
 */

/**
 * task0437.Triangle of eights
 * <p>
 * Using a for loop, display a right triangle of eights, with a base of 10 and a height of 10.
 * Example output:
 * 8
 * 88
 * 888
 * 8888
 * 88888
 * 888888
 * 8888888
 * 88888888
 * 888888888
 * 8888888888
 */

public class Triangle {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}