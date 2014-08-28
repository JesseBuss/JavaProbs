package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ProjectEuler16 {
	public static void main(String[] args){
		BigInteger bi = new BigInteger("2");
		bi = bi.pow(1000);
		List<Integer> digits = new ArrayList<Integer>();
		BigInteger helper = new BigInteger("0");
		while (!bi.equals(new BigInteger("0"))){
			helper = bi.mod(new BigInteger("10"));
			digits.add(helper.intValue());
			bi = bi.divide(new BigInteger("10"));
		}
		int sum = 0;
		for(Integer i: digits){
			sum += i;
		}
		System.out.println("Problem 16 solution = " + sum);
	}
}
