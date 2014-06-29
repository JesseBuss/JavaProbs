package ProjectEuler;

public class ProjectEuler6 {
	public static void main(String[] args){
		int sum1 = 0;
		for (int i = 1; i<= 100; i++)
			sum1 += i*i;
		//1 + 2 + ... + 100 = 5050...I remember this from math class.
		int sum2 = 5050*5050;
		System.out.println(sum2-sum1);
	}
}
