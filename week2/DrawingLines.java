package week2;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;
/** This class allow users to draw lines on the canvas */
public class DrawingLines extends GraphicsProgram {
	public void init() {
		addMouseListeners();
	}
/** Called on mouse press to record the starting coordinates */
	public void mousePressed(MouseEvent e) {
		line= new GLine(e.getX(),e.getY(), e.getX(), e.getY());
		add(line);
	}
	
/** Called on mouse drag and shape the current Line */
	public void mouseDragged(MouseEvent e) {
		line.setEndPoint (e.getX(), e.getY());
		
	}
	/**Private state */
	private GLine line;
	

}
