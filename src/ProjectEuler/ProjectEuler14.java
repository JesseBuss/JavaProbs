package ProjectEuler;

import java.util.ArrayList;
import java.util.List;

public class ProjectEuler14 {
	public static void main(String[] args){
		int maxLength = 0;
		int start = 0;
		for(int i = 13; i < 1000000; i++){
			long n = i;
			List<Long> temp = new ArrayList<Long>();
			temp.add(n);
			while (n!= 1){
				if(n%2 == 0)
					n = n/2;
				else
					n = 3*n+1;
				temp.add(n);
				
			}
			if (temp.size() > maxLength){
				maxLength = temp.size();
				start = i;
			}
		}
		System.out.print("Problem 14 solution = " + start);
	}
}
