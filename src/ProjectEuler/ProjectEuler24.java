package ProjectEuler;

import java.math.BigInteger;

public class ProjectEuler24 {
	public static void main(String[] args){
		BigInteger bi1 = new BigInteger("1");
		BigInteger bi2 = new BigInteger("1");
		double term = 2;
		while (bi2.toString().length() < 1000){
			BigInteger tmp = bi2.add(bi1);
			bi1 = bi2;
			bi2 = tmp;
			term++;
		}
		System.out.println(term);
	}
}
