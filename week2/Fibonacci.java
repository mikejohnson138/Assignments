package week2;

import acm.program.*;


public class Fibonacci extends ConsoleProgram {
/** this sets the max value of the sequence to 10000 */
private static final int MAX= 10000;
/* This runs the program */
public void run() { 
	println("This Program lists the Fibonacci Seqeuence to 10000");
	int n1=0;
	int n2=1;
	
	while (n1<MAX) {
		println (n1);
		int n3= n1 + n2;
		n1=n2;
		n2=n3;
		
		}
	}
}