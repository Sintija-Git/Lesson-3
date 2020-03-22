package lesson3;
/**
a simple demo of using the setter method
A setter method is a method which sets/mutates the value of an instance variable. 
*/
import java.util.Scanner;

public class SetterDemoApp {

	public static void main(String[] args) {
		// declare a variable to store the user's input
		int n;
		Scanner myScanner = new Scanner (System.in); // create an object of type Scanner to allow reading from the keyboard
		// prompts the user to input a number
		System.out.println("Please enter the integer number here: ");
		n = myScanner.nextInt();
		
		// declare a variable named demo of type SetterDemo, and create an object of type SetterDemo
		SetterDemo demo = new SetterDemo (); // create an object of type SetterDemo
		
		// use the setter method called setX() to set/assign the value of variable n to the x instance variable
		demo.setX(n);
		//prompts the user to input another number
		System.out.println("Please enter another integer number here: ");
		n = myScanner.nextInt();
		
		// use the setter method called setX() to set/assign the value of variable n to the x instance variable
		demo.setX(n);
		
		// prompts the user to input another number
		System.out.println("Please enter yet another integer number here: ");
		n = myScanner.nextInt();
		demo.setX(n);
		
		// use the setter method called setX() to set/assign the value 10 to the x instance variable
		demo.setX(10);
		
		// use the setter method called setX() to set/assign the value -7 to the x instance variable
		demo.setX(-7);
		
	} // ends the main method
} // ends the class

		

