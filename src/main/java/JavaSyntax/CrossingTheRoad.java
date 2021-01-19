package JavaSyntax;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Anna S. Almielka
 */

/**
 * Crossing the road blindly
 * <p>
 * The pedestrian traffic light is programmed as follows: at the beginning of each hour,
 * the green signal is on for three minutes, then the signal is yellow for one minute,
 * and then it is red for one minute. Then the light is green again for three minutes, etc.
 * Use the keyboard to enter a real number t that represents the number of minutes
 * that have elapsed since the beginning of the hour.
 * Determine what color the traffic light is at the specified time.
 * Display the result as follows:
 * "green" if the light is green, "yellow" if the light is yellow, and "red" if the light is red.
 * <p>
 * Example for 2.5:
 * green
 * Example for 3:
 * yellow
 * Example for 4:
 * red
 * Example for 5:
 * green
 */
public class CrossingTheRoad {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double m = Double.parseDouble(br.readLine());
        System.out.println(whatColor(m));
    }

    public static String whatColor(double m) {

        m %= 5;

        switch ((int) m) {
            case 3:
                return "yellow";
            case 4:
                return "red";
            default:
                return "green";
        }
    }

}
