package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		// Check the recipe to find out what code to put here
		Robot rob = new Robot();
		rob.setX(0);
		rob.setX(250);
		rob.setSpeed(10000);
		buildhouse(rob,100, 23,234,12,1);
		buildhouse(rob,50,132,22,255,10);
		buildCoolHouse(rob,60,150,200,5,20);
		buildhouse(rob,300,123,123,124,80);
		
	}
	public void buildhouse(Robot rob, int height,int r,int g, int b, int seperation ) {
		
	
	
	rob.penDown();
	rob.turn(90);
	rob.move(seperation);
	rob.turn(-90);
	rob.move(height);
	rob.turn(90);
	rob.move(20);
	rob.turn(90);
	rob.move(height);
	rob.setPenColor(0, 255, 0);
	rob.turn(-90);
	rob.move(10);
	rob.turn(-90);
	rob.setPenColor(r,g,b);

	}
	public void buildCoolHouse(Robot rob, int coolHeight, int r, int g, int b, int seperation) {
		
		rob.penDown();
		rob.turn(90);
		rob.move(seperation);
		rob.turn(-90);
		rob.move(coolHeight);
		rob.turn(45);
		rob.move(14);
		rob.turn(90);
		rob.move(14);
		rob.turn(45);
		rob.move(coolHeight);
		rob.turn(-90);
		rob.setPenColor(r,g,b);
		rob.move(10);
		rob.turn(-90);
	

	}
}
  