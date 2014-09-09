package ProjectEuler;

import java.util.HashMap;
import java.util.Map.Entry;

public class ProjectEuler23 {
	public static void main(String[] args){
		HashMap<Integer, Boolean> abundantNumbers = getAbundantNums();
		System.out.println(finalSum(abundantNumbers));
	}
	
	public static HashMap<Integer, Boolean> getAbundantNums(){
		HashMap<Integer, Boolean> abundantNumbers = new HashMap<Integer,Boolean>();
		for (int i = 12; i <= 28123; i++){
			if (isAbundant(i)){
				abundantNumbers.put(i, true);
			}
		}
		return abundantNumbers;
	}
	
	public static boolean isAbundant(int num){
		int factorSum = 1;
		for (int i = 2; i <= Math.sqrt(num); i++){
			if (num % i == 0)
			{
				factorSum += i;
				factorSum += num/i;
				
				if (i == num/i)
					factorSum -= i;
			}
		}
		return factorSum > num;
	}
	
	private static double finalSum(HashMap<Integer, Boolean> abundantNumbers){
		double sum = 0;
		for (int i = 1; i <= 28123; i++){
			boolean found = false;
			for(Entry<Integer,Boolean> entry : abundantNumbers.entrySet()){
				if (i == 24){
					System.out.println("key = " + entry.getKey() + " " + (entry.getKey() > i));
					System.out.println("key = " + entry.getKey() + " " + (abundantNumbers.containsKey(i - entry.getKey())));
				}
				if (abundantNumbers.containsKey(i - entry.getKey())){
					found = true;
					break;
				}
			}
			if (!found)
				sum += i;
		}
		return sum;
	}
}
