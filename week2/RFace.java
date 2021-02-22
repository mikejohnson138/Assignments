/*
 * File:RFace.java
 * ---------------
 * This file defines a compound RFace class.
 */

package week2;
import java.awt.Color;
import acm.graphics.*;
public class RFace extends GCompound {
/** Construct a new RFACE object with the specified dimensions. */
public RFace(double width, double height) {
	head = new GRect(width, height);
	head.setFillColor(Color.DARK_GRAY);
	head.setFilled(true);
	leftEye = new GOval(EYE_RADIUS * width, EYE_HEIGHT * height);
	leftEye.setColor(Color.yellow);
	leftEye.setFillColor(Color.yellow);
	leftEye.setFilled(true);
	rightEye = new GOval(EYE_RADIUS * width, EYE_HEIGHT * height);
	rightEye.setColor(Color.yellow);
	rightEye.setFillColor(Color.yellow);
	rightEye.setFilled(true);
	mouth = new GRect(MOUTH_WIDTH * width, MOUTH_HEIGHT * height);
	mouth.setFillColor(Color.white);
	mouth.setFilled(true);
	add(head, 0, 0);
	add(leftEye, 0.25 * width - EYE_RADIUS * width / 2,
				 0.25 * height - EYE_HEIGHT * height / 2);
	add(rightEye, 0.75 * width - EYE_RADIUS * width / 2,
				   0.25 * height - EYE_HEIGHT * height / 2);
	add(mouth, 0.50 * width - MOUTH_WIDTH * width / 2,
			    0.75 * height - MOUTH_HEIGHT * height / 2);
	}
/* Constants specifying feature size as a fraction of the head size */
	private static final double EYE_RADIUS = 0.15;
	private static final double EYE_HEIGHT = 0.15;
	private static final double MOUTH_WIDTH = 0.75;
	private static final double MOUTH_HEIGHT = 0.15;
/* Instance variables */
	private GRect head;
	private GOval leftEye, rightEye;
	private GRect mouth;
}
