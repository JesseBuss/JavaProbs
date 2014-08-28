package ProjectEuler;

import java.util.Calendar;

public class ProjectEuler19 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		c.set(1901, Calendar.JANUARY, 0);
		int sum = 0;
		for (int i = 1901; i <= 2000; i++){
			for (int j = 0; j < 12; j++){
				c.set(Calendar.YEAR, i);
				c.set(Calendar.MONTH, j);
				c.set(Calendar.DAY_OF_MONTH, 1);
				if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
				{
					sum++;
				}
			}
		}
		System.out.println("Sum = " + sum);
	}
}
