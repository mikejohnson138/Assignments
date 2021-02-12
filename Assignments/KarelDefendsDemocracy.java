package week1;
import stanford.karel.*;
/* This is a program to clean unwanted Chads left remaining on a ballot*/

public class KarelDefendsDemocracy extends SuperKarel {
/* Checks for valid vote*/
	
	public void run() {
		while (frontIsClear()) {
		move();
			if (noBeepersPresent()) {
				checkNorthforChad();
				checkSouthForChad();
				move();
			}
			else {
				move();
			}
		 }
	 }
	/* If valid vote is found, checks and cleans any Chad left on the North side of ballot*/
	
	private void checkNorthforChad() {
		turnLeft();
		move();
		while (beepersPresent())
			pickBeeper();
			turnAround();
			move();
			turnLeft();
	}
		/* If valid vote is found, checks and cleans any chad on the South side of ballot */
	
		private void checkSouthForChad() {
			turnRight();
			move();
			while (beepersPresent())
				pickBeeper();
				turnAround();
				move();
				turnRight();
							}
		
		
}
