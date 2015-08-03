package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

		Robot velma = new Robot();
		
		for (int i = 0; i < 360; i++) {
			velma.penDown();
			velma.setSpeed(100);
			velma.setRandomPenColor();
			velma.move(10);
			velma.turn(1);
		} 
				
		
	}
	
}