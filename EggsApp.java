package lesson3;
import java.util.Scanner;
/*
Problem 1
        Read the next problem, and then draw/write, on paper, the Class Diagram
        to plan the classes you will need to write to develop the application.
        John the farmer has tasked his son with collecting the eggs from the
        chicken cage each morning and putting them in boxes of 1 dozen eggs each.
        Unfortunately, John's son Joe is having trouble working out how many boxes
        he will need each morning. You have been asked to develop a java application
        to allow Joe to enter the number of eggs he has collected. The application
        should then calculate and display how many boxes can be filled and how
        many eggs Joe will have leftover.
        Your application should use instantiable classes to separate the calculations from the user input and output.
        Hint: there are 12 eggs in 1 dozen.
        EggsApp.java
        -- takes input from the user
        -- uses the Eggs -- the instantiable class to perform the actual computations
*/
public class EggsApp {

	public static void main(String[] args) {
		//decl local variables
		
		int eggsCount, boxesCount, leftEggsCount;
			
		
	//obj of type Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("How many eggs today, boy? ");
		eggsCount = sc.nextInt();
		
		
		//declare a variable called eggsCalc to access all the instance variables, all methods
		
		Eggs eggsCalc = new Eggs();
		
		
		eggsCalc.setEggsCount(eggsCount);
		
		
		eggsCalc.compute();
		
		eggsCalc.getBoxesCount();
		eggsCalc.getleftEggsCount();
		
		boxesCount = eggsCalc.getBoxesCount();
		System.out.println("Number of boxes required: " + boxesCount);
	
		leftEggsCount = eggsCalc.getleftEggsCount();
		System.out.println("Remaining eggs: " + leftEggsCount);	

	
	}
}
