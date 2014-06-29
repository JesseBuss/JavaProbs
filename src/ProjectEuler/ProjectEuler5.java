package ProjectEuler;

public class ProjectEuler5 {
	public static void main(String[] args){
		//begin loop
		for (int d = 2520; true; d++){
			if (isDivisible(d)){
				System.out.println(d);
				break;
			}
		}
	}
	
	//Determines if a number is divisible by
	//1, 2, 3, ... 20
	private static boolean isDivisible(int d){
		for (int i = 2; i <= 20; i++){
			if (d % i != 0)
				return false;
		}
		return true;
	}
}
