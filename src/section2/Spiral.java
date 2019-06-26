package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot a=new Robot();
		a.setSpeed(99999);
		// 5. Set your robot's pen down 
		a.penDown();
		// 3. Set the robot to go at max speed (100)
		
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 75; i++) {
			
		
			// 7. Change the pen color to random
		a.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			a.move(3*i);
			// 2. Turn the robot 360/7 degrees to the right
		a.turn(360/5);
			// 8. Set the pen width to i
			a.setPenWidth(i);
		}
		}
}
