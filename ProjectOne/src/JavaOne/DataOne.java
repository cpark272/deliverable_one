package JavaOne;
import java.util.Scanner;

public class DataOne {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//List of variables
		String eventType;
		int partySize;
		String mealSuggestion = null;
		String prepSuggestion = null;
		String result = null;
		
		//eventType question and results
		System.out.println("Please enter the event type (casual, semi-formal, formal):");
		eventType = scan.next();
		
		if (eventType.equals("casual")) {
			mealSuggestion = "sandwiches";
		}
		if (eventType.equals("semi-formal")) {
			mealSuggestion = "fried chicken";
		}
		if (eventType.equals("formal")) {
			mealSuggestion = "chicken parmesan";
		}
		
		//partySize question and results
		System.out.println("Please enter the party size (must have at least one guest):");
		partySize = scan.nextInt();
		
		if (partySize == 1) {
			prepSuggestion = "in the microwave";
		}
		if (partySize >= 2 && partySize <= 12) {
			prepSuggestion = "in your kitchen";
		}
		if (partySize >= 13) {
			prepSuggestion = "by a caterer";
		}
		
		
		//Creates string called result to formulate output
		result = "Since you're hosting a " + eventType + " event for " + partySize + " participants, you should serve " + mealSuggestion + " prepared " + prepSuggestion + ".";
				
		System.out.println(result);
		
		
		//System.out.println("Since you're hosting a " + eventType + " event for " + partySize + " participants, you should serve " + mealSuggestion + " prepared " + prepSuggestion + ".");


		
	}

}
