/**
 * @author Yaaqov Shkifati
 * @since 10/13/19
 * @version 1.0
 *
 * Description: In the program will be using the Monte Carlo Method to estimate
 * pi. The simulation of a random darts thats been thrown at a circular
 * dartboard with a radius of 1 foot attached to a square with a 2 feet in
 * length. The ratio between the area of the circle and the area of the square.
 * We will calculate the number hit the square + number that hit the dartboard /
 * number that hit the dartboard. Then will generate a pseudo random number from
 * the time in seconds since midnight restricting its range from -1 and 1. The
 * distance would tell us if our xPosistion(xPos) and yPosistion(yPos) is 
 * in the unit circle. The more number of throws we get the more closer will get
 * to the estimation of PI.
 * 
 * The way will write this program is that will seed our random number generator
 * beginning and at the end. Then create a while loop with a condition that 
 * number of throws is greater than zero. Within the loop will create a for loop
 * that will generate random xPos and yPos coordinates between -1 and 1. If the 
 * inside of the circle xPos and yPos we will have a boolean method to return
 * the distance if greater than 1. Then will compute the Pi estimation, as we 
 * increase our value of number throws to obtain our desired approximation
 * (3.1415).
 */
package montecarlo;

import java.util.Scanner;
import java.util.Random;

public class MonteCarlo {

    public static void main(String[] args) {
        double InCircle, numThrows, piEstimter;

        Scanner dc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("This program approximates PI using the Monte Carlo"
                + " method.");
        System.out.println("It simulates throwing darts at a dartboard.");
        System.out.print("Please enter number of throws:\n");

        long startTime = System.currentTimeMillis();
        numThrows = dc.nextDouble();
        while (numThrows > 0) {
            InCircle = 0;
            for (int i = 0; i < numThrows; i++) {
                double xPos = rnd.nextDouble() * Math.pow(-1, rnd.nextInt());
                double yPos = rnd.nextDouble() * Math.pow(-1, rnd.nextInt());
                if (isInside(xPos, yPos)) {
                    InCircle++;
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Total time:" + (endTime - startTime));

            piEstimter = 4.0 * InCircle / numThrows;
            System.out.printf(" piEstimter =%.4f%n%n", piEstimter);

            numThrows = dc.nextDouble();
        }
    }

    public static boolean isInside(double xPos, double yPos) {
        double distance = Math.sqrt((xPos * xPos) + (yPos * yPos));

        return (distance < 1.0);
    }
}
