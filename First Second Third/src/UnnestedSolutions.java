import java.util.Random;

public class UnnestedSolutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first, second, third, max, mid, min;
		
		max = 0;
		mid = 0;
		min = 0;
		
		//getting random values
		Random rand = new Random();
		first = rand.nextInt() & 51;
		second = rand.nextInt() & 51;
		third = rand.nextInt() & 51;
		
		if(first == second || first == third || second == third) {
			first = rand.nextInt() & 51;
			second = rand.nextInt() & 51;
			third = rand.nextInt() & 51;
		}
		
		
		System.out.println("first: " + first + ", second: " + second + ", third: " + third);
		
		max = first;
		
		if(second >= first) {
			max = second;
			mid = first;
		} else {
			mid = second;
		}
		
		
		if(third >= first) {
			min = mid;
			mid = max;
			max = third;
			
			//mid = first;
			//min = second;
			
		} else if(third >= second) {
			min = mid; 
			mid = third;
			
		} else {
			min = third;
		}
		
		
		
		System.out.println("max: " + max + ", mid: " + mid + ", min: " + min);
		
	}

}
