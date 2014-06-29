package ProjectEuler;

public class ProjectEuler9 {
	public static void main(String[] args){
		for (int b = 1; b < 1000; b++)
		{
			for (int a = 1; a < b; a++)
			{
				int tempC = b*b + a*a;
				double c = Math.sqrt(tempC);
				if ((a+b+c) == 1000)
				{
					System.out.println("a = " + a + ", b = " + b + ", c = " +c);
					
					System.out.println(a*b*c);

					System.exit(0);
				}
			}
		}
	}
}
