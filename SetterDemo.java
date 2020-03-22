package lesson3;
/**
a simple demo of using the setter method
A setter method is a method which sets/mutates the value of an instance variable.
*/
public class SetterDemo {
    // declare an instance variable
	private int x;	
	/* recall that if we do not declare a constructor with parameters within a class, we have the option to not declare 
	 * any constructors because the java compiler adds the default constructor (i.e. the constructor without any parameters)
	 *  only when we do not declare any constructors within a class */
	
	// declare a constructor without any parameters
	
	// the instance variables are initialized with their default values, in this case x is going to be initialized with 0
	public SetterDemo() {
	}	
	
	// declare a setter method which allows to store a value into the instance variable named x
	public void setX(int value){
		
	    // please note that the role of a setter method is to just set/assign a new value into the corresponding instance variable, in this case x 
		//a setter method will never contain System.out.println() statement, I include them here for pedagogical purposes only, namely to see the value of x before and after the assignment operation
	    System.out.println("a setter method allows to store a value into an instance variable");
	    System.out.println("e.g. setX(int) will store a value into x");
		System.out.println("before: " + x);
		// store the content of the value variable in the instance variable named x
		x = value;
		System.out.println("after: " + x);
		System.out.println();
	}
}