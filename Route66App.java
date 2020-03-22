package lesson3;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Route66App {

	private static DecimalFormat df2 = new DecimalFormat ("#.##");
	public static void main(String[] args) {
		
		//declare local variables
		double speed ;
		int membersCount;
		
		// declare a variable sc to be able to 	work with an object of type Scanner
		Scanner sc = new Scanner (System.in);
		// and create an object of type Scanner to allow input from the keyboard
		
		//prompt the user to input required data and read the input from the user
		System.out.println("Enter the teams average speed in km/h: ");
		speed = sc.nextDouble();
		
		System.out.println("Enter the number of team members: ");
		membersCount = sc.nextInt();
		
		//declare a variable called routeCalc and create an object of type Route66
		Route66 routeCalc = new Route66();
		
		//call/invoke the setter methods to assign the values provided by the user to the routeCalc obj instance variables
		//set/update the value of the obj instance variables called speed with the value provided by user
		routeCalc.setSpeed(speed);
		//set/update the value of the obj instance variables called numMembers with the value provided by user
		routeCalc.setNumMembers(membersCount);
		
		//PROCESSING
		routeCalc.calculateMetrics();
		
		//OUTPUT
		//the problem does NOT ask to display the race details, but it makes app more user friendly
		System.out.println("______________________________");
		System.out.println ("RACE DETAILS: " + routeCalc.getRaceDetails());
		System.out.println("______________________________");
		
		// output the metrics calculated by routeCalc
		//retrieve each metric value using corresponding getter method
		double value1 = routeCalc.getTime();
		System.out.println ("Estimated time for the team to complate the journey: " + df2.format(value1) + " hr");
		
		int value2 = routeCalc.getNumBlocks();
		System.out.println ("The number of full 15h blocks cycled is: " + value2 );
		
		value2 = routeCalc.getNumBlocksPerMember();
		System.out.println ("The number of full blocks each team member will cycle: " + value2);
		
		value1 = routeCalc.getLeftOverTime();
		System.out.println("The number of hr left at the end: " + df2.format(value1) + " hr");
		
		System.out.println("______________________________");
		
			
	}
}
