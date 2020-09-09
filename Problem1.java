
import java.util.Scanner;


public class Problem1 {
	
	
	
	
	
	public static void Problem1Method() {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		//once finished
		reader.close();
		
		
	int sum = 0;
	
	for (int i = 1; i < n; i++) {
		
		if (i % 5 == 0) {
		sum += i;
	}
		else if (i % 3 == 0) {
			
			sum += i;
		}
	
}
	System.out.println("Question1 " + sum);
}
}