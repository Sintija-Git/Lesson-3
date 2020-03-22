package lesson3;

/**
Problem 1
Read the next problem, and then draw/write, on paper, the Class Diagram
to plan the classes you will need to write to develop the application.
John the farmer has tasked his son with collecting the eggs from the
chicken cage each morning and putting them in boxes of 1 dozen eggs each.
Unfortunately, John's son Joe is having trouble working out how many boxes
he will need each morning. You have been asked to develop a java application
to allow Joe to enter the number of eggs he has collected.
The application should then calculate and display how many boxes can be filled and how many eggs Joe will have leftover.
Your application should use instantiable classes to separate the calculations from the user input and output.
Hint: there are 12 eggs in 1 dozen.
Eggs.java -- the instantiable class
*/

public class Eggs {
	
	//declare a constant (douzen egges =12)
	private final int DOZEN = 12;
	
	// declaring instance variables
	private int eggsCount;
	private int boxesCount;
	private int leftEggsCount;
	
	//declare a constructor without parameters, so everything in it will have default value (0, null, false etc)
	
	public Eggs () {
		
//		eggsCount = 0; 
//		boxesCount = 0;
//		leftEggsCount = 0;
		
	}
			
		//decl setter method
		public void setEggsCount (int eggsCount) {
			this.eggsCount = eggsCount;
			
		}
		
//		public void calculateMetrics () {
//			boxesCount = eggsCount / DOZEN;
//			leftEggsCount = eggsCount - boxesCount * DOZEN;
//			
//		}

		public void compute() {
			boxesCount = eggsCount / DOZEN;
			leftEggsCount = eggsCount - boxesCount * DOZEN;
			
		}
	
		//decl getter method
		public int getBoxesCount () {
			return boxesCount;
		
		}
		
		public int getleftEggsCount () { 
		return leftEggsCount;
		
	}


}
