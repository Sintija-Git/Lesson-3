package lesson3;
/**
Lab: Instantiable Classes
Problem 2
Route 66 is a highway in the USA with a length of 3,945 Km.
A cross country Bicycle race has been scheduled where people work in teams to cycle this highway non-stop
from one end to the other.
The race has a rule that no one cyclist can cycle for more than 15 hours at a time.
You have been asked to develop an application that allows the user to enter


the team's projected average speed in kilometres per hour and the number of members on the team.

The application should then calculate and display:
-- the time it will take the team to complete the journey,
-- the number of full 15 hour blocks to be cycled,
-- how many full blocks each team member will cycle,
-- how many hours would be leftover at the end.

Your application should be developed using instantiable classes.
All classes should be correctly commented and formatted.
Save your instantiable class as Route66.java
Route66.java -- the instantiable class which calculates the different metrics according to the problem description
*/

public class Route66 {

private double speed;
private int numMembers;
	
private double time;
private int numBlocks;
private int numBlocksPerMember;
private double leftOverTime;

//declare (instance constants)
private final int ROUTE_LENGTH = 3945;
private final int MAX_TIME_BLOCK_CONTINUOUS_CYCLE = 15;

// declare a constructor without parameters
public Route66() {
	// REMEBBER - that all above will be initialized with default value after object constructor (int 0, String null, double 0. etc)
	
}
//dec a setter method
public void setSpeed (double speed) {
	this.speed = speed;
	
}

public void setNumMembers (int count) {
	this.numMembers = count;
	
}

//decl getter method - for each variable that we need to use in another class as well 
public double getTime() {
	return time;
	
}

public int getNumBlocks() {
	return numBlocks;
	
}
	
public int getNumBlocksPerMember () {
	return numBlocksPerMember;
}

public double getLeftOverTime () {
	return leftOverTime;
}

//method to calc metric
public void calculateMetrics () {
	time = ROUTE_LENGTH / speed;
	numBlocks = (int) time / MAX_TIME_BLOCK_CONTINUOUS_CYCLE;
	numBlocksPerMember = numBlocks / numMembers;
	leftOverTime = time % MAX_TIME_BLOCK_CONTINUOUS_CYCLE;
	
	
}

// user friendly details of the race
public String getRaceDetails() {
		String info = "Route66 distance: " + ROUTE_LENGTH + "km. One cyclist max time block can cycle: " +  
		MAX_TIME_BLOCK_CONTINUOUS_CYCLE + " hours with average speed  " + speed  + "kmh.";
return info;

	}
}
