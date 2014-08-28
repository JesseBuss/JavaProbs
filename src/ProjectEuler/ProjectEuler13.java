package ProjectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class ProjectEuler13 {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		BigInteger[] input = new BigInteger[100];
		BigInteger sum = new BigInteger("12");
		for(int i = 0; i < 100; i++){
			input[i] = new BigInteger(s.next());
			sum = sum.add(input[i]);
		}
		System.out.println(sum);
	}
}
