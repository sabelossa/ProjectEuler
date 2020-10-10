
import java.util.Scanner;


public class Problem01 {
	
	
	
	
	
	public static int Problem1Method() {
		
		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); 
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
	return sum;
}
	
	public static void main(String args[]) {
		
		System.out.println(Problem1Method());
	
}
	
}