import java.util.Random;


public class NestedSolution {

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
			
			//checking first
			if(first >= second || first >= third) {
				
				if(first >= second && first >= third) {
					max = first;
				} else {
					mid = first;
				}
			} else {
				min = first;
			}
			
			//checking second
			if(second >= first || second >= third) {
				
				if(second >= first && second >= third) {
					max = second;
				} else {
					mid = second;
				}
			} else {
				min = second;
			}
			
			//checking third
			if(third >= first || third >= second) {
				
				if(third >= first && third >= second) {
					max = third;
				} else {
					mid = third;
				}	
			} else {
				min = third;
			}
			
			System.out.println("max: " + max + ", mid: " + mid + ", min: " + min);
			
	}

}
