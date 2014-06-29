package ProjectEuler;

public class ProjectEuler7 {
	public static void main (String[] args){
		int primeCounter = 6; //already counting 1-13
		int lastPrime = 0;
		for (int i = 14; primeCounter < 10001; i++)
		{
			if (isPrime(i)){
				lastPrime = i;
				primeCounter++;
			}
		}
		System.out.println(lastPrime);
	}
	
	private static boolean isPrime(int d)
	{
		double max = Math.sqrt(d) + 1;
		for (int i = 2; i < max; i++)
		{
			if (d%i == 0)
				return false;
		}
		return true;
	}
}