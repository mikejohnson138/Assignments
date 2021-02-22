package week2;
/** This Program Draws 10 Random Circles of 
 * 10 Random sizes and
 * 10 different colors (including white)
 */
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class  RandomCircles extends GraphicsProgram{
	
	/*Creates the number and size of the circles*/
	private static final int NUMBER_CIRCLES = 10;
	private static final double MIN_RADIUS= 5;
	private static final double MAX_RADIUS= 50;

/* This runs the program */
public void run() {
	
	for (int i=0; i<NUMBER_CIRCLES; i++) {
		double r= rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		double x= rgen.nextDouble(0, getWidth() - 2*r);
		double y = rgen.nextDouble(0, getHeight() -2 * r);
		GOval circle= new GOval(x,y,2*r,2*r);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle);
	

	}
}
/* Creates an instance variable for the random number generator */
private RandomGenerator rgen = RandomGenerator.getInstance();
}

