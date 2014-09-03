package Arrays;

//http://community.topcoder.com/stat?c=problem_statement&pm=11031

public class TheAirTripDivTwo {
	public static void main(String[] args){
		System.out.println(find(new int[] {1,2,3,4,5,6,7}, 10));
		System.out.println(find(new int[] {7, 6, 5, 4, 3, 2, 1}, 10));
		System.out.println(find(new int[] {1}, 1000));
		System.out.println(find(new int[] {8, 7, 7, 1, 5, 7, 9}, 21));
	}
	
	public static int find(int[] flights, int fuel){
		int count = 0;
		for (int i = 0; i < flights.length; i++){
			if (flights[i] <= fuel){
				count++;
				fuel -= flights[i];
			}
			else
			{
				break;
			}
		}
		return count;
	}
}
