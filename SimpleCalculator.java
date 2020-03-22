package lesson3;

/*
SimpleCalculator -- define an instantiable class to perform arithmetic operations
This example shows how to declare an instantiable class, and in particular:
-- how to declare instance variables/ fields
-- how to declare setter and getter methods corresponding to the instance variables
-- how to declare a method to return a value
*/
public class SimpleCalculator {
	//declare instance variables 
	private double firstNumber = 10;
	private double secondNumber = 2;
	private double result;
	//declare action ouf our processing method
	public void multiply(){
		result = firstNumber * secondNumber;
}
	public void devide() {
		result = firstNumber / secondNumber;
	}
	
	public void add (){
		result = firstNumber + secondNumber;
	}
	
	public void subtract () {
		result = firstNumber - secondNumber;
	}
	public void display(){
		System.out.println("Our first number: " + firstNumber);
		System.out.println("Our second number: " + secondNumber);
		System.out.println ();
	}
		//declare setter method - to receive a value from the user
	public void setFirstNumber(double number) {
		//this stores number in the firstNumber of instance variable
		firstNumber = number;
	}
	public void setSecondNumber(double num) {
		//this stores number in the secondNumber of instance variable
		secondNumber = num;
	}
//getter method for instance variable result, which should retreive/get result of computing
	public double getResult() {
		return result;
	}
}