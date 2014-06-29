package ProjectEuler;

public class ProjectEuler12 {
	public static void main(String[] args){
		double d = 1; //use a double so we don't hit max integer
		int iterator = 2;
		while (true)
		{
			d += iterator;
			if (over500(d))
				break;
			iterator ++;
		}
		System.out.println(d);
	}
	
	public static boolean over500(double in)
	{
		int result = 0;
		for (int i = 1; i < Math.sqrt(in); i++)
		{
			if (in % i == 0)
				result++;
		}
		result = result * 2;
		return result > 500;
	}
}
