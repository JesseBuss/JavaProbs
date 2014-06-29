package ProjectEuler;

import java.util.ArrayList;

public class ProjectEuler3 {
	public static void main (String[] args){
		long input = 600851475143l;
		long maxUniqueFactor = (long)Math.ceil(Math.sqrt(input));
		ArrayList<Long> factors = new ArrayList<Long>();
		
		 // We only have to loop to the square root of the input.
		 // There are no unique factors that will be found that are
		 // greater than the square root. -- Saves a lot of time.
		for (long i = 2; i <= maxUniqueFactor; i++){
			if (input % i == 0) // i is a factor of the input
			{
				if (isPrime(i)){ // Check if i is prime.
					factors.add(i);
				}
				else if (isPrime(input/i)){ //Check if i's companion is prime.
					factors.add(input/i);
				}
			}
		}
		
		// Traverse the list of added factors to find the max.
		long max = 0;
		for (int i = 0; i < factors.size(); i++){
			if(factors.get(i) > max){
				max = factors.get(i);
			}
		}
		
		//Print out the result.
		System.out.println(max);
	}
	
	//helper method to determine if numbers are prime.
	private static boolean isPrime(long l)
	{
		for (int i = 2; i <= l/2 -1; i++)
		{
			if (l % i == 0)
				return false;
		}
		return true;
	}
}
