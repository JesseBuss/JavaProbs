package ProjectEuler;

import java.math.BigInteger;

public class ProjectEuler20 {
	public static void main(String[] args){
		BigInteger b = new BigInteger("1");
		for (int i = 2; i <= 100; i++)
			b = b.multiply(new BigInteger(""+i));
		int sum = 0;
		BigInteger helper = new BigInteger("0");
		while (!b.equals(new BigInteger("0"))){
			helper = b.mod(BigInteger.TEN);
			sum += helper.intValue();
			b = b.divide(BigInteger.TEN);
		}
		System.out.println("Problem 20 solution = " + sum);
	}
}
