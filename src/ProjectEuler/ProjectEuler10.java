package ProjectEuler;

public class ProjectEuler10 {
	public static void main(String[] args) {
		double sum = 17; // Piggyback of question
		for (int i = 11; i < 1999999; i+=2) {
			if (isPrime(i))
				sum += i;
		}
		System.out.println(sum);
	}
	
	private static boolean isPrime(int primeCandidate){
		double max = Math.sqrt(primeCandidate)+1;
		
		for (int i = 2; i < max; i++){
			if (primeCandidate % i == 0)
				return false;
		}
		return true;
	}
}
