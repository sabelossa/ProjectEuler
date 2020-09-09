import java.util.ArrayList;

public class Problem2 {

	
		
	
	public static void Problem2Method() {
		
		int sum = 0;
		
		ArrayList<Integer> fib = new ArrayList<Integer>();
		
		int one = 1;
		int two = 2;
		fib.add(one);
		while(two <= 4000000) {
			fib.add(two);
			int temp = one;
			one = two;
			two = temp + two;
			
		}
		
		for (int i : fib) {
			if (i % 2 == 0) {
				sum+= i;
			}
		}
		
		System.out.println(sum);
	}
	
}
	
		
		

