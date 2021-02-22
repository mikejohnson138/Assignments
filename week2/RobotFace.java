/*
 * File: RobotFace.java
 * --------------------
 * This program creates a RFace object in the center
 * of the canvas. 
 */
package week2;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {
/** Width of the face */
	private static final double MAX_WIDTH = 305;
/** Height of the face */
	private static final double MAX_HEIGHT = 450;
/** Runs the program */
public void run() {
	RFace face = new RFace(MAX_WIDTH, MAX_HEIGHT);
	double x = (getWidth() - MAX_WIDTH) / 2;
	double y = (getHeight() - MAX_HEIGHT) / 2;
	add(face, x, y);
	}
}



