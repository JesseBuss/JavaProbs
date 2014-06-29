package ProjectEuler;

public class ProjectEuler2 {
	public static void main (String[] args){
		int secondPrevious = 1;
		int previous = 2;
		int nextTerm = 0;
		int sum = 2; // Add 2 automatically.
		while (nextTerm < 4000000){
			nextTerm = secondPrevious + previous;
			if (nextTerm % 2 == 0)
				sum += nextTerm;
			secondPrevious = previous;
			previous = nextTerm;
		}
		System.out.println(sum);
	}
}
