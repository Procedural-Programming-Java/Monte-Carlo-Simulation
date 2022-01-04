# Monte-Carlo-Simulation

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
