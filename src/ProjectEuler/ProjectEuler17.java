package ProjectEuler;

import java.util.Hashtable;

public class ProjectEuler17 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		Hashtable h = new Hashtable();
		h.put(0, 0);
		h.put(1, 3);
		h.put(2, 3);
		h.put(3, 5);
		h.put(4, 4);
		h.put(5, 4);
		h.put(6, 3);
		h.put(7, 5);
		h.put(8, 5);
		h.put(9, 4);
		h.put(10, 3);
		h.put(11, 6);
		h.put(12, 6);
		h.put(13, 8);
		h.put(14, 8);
		h.put(15, 7);
		h.put(16, 7);
		h.put(17, 9);
		h.put(18, 8);
		h.put(19, 8);
		h.put(20, 6);
		h.put(30, 6);
		h.put(40, 5);
		h.put(50, 5);
		h.put(60, 5);
		h.put(70, 7);
		h.put(80, 6);
		h.put(90, 6);
		h.put("h", 7);
		h.put("a", 3);
		h.put(1000, 11);
		int sum = 0;
		for (int i = 1; i <= 1000; i++){
			if (i <= 99){
				sum += getTwo(i, h);
			} else if (i < 1000){
				if (i%100 == 0){
					sum += (Integer)h.get(i/100);
					sum += (Integer)h.get("h");
				} else {
					sum += (Integer)h.get(i/100);
					System.out.println("i/100 = " + sum);
					sum += (Integer)h.get("h");
					System.out.println("h = " + sum);
					sum += (Integer)h.get("a");
					System.out.println("a = " + sum);
					sum += getTwo(i%100, h);
					System.out.println("i%100 = " + sum);
				}
			} else {
				sum += (Integer)h.get(i);
			}
		}
		System.out.print("\n" + sum);
	}
	
	@SuppressWarnings("rawtypes")
	private static int getTwo(int i, Hashtable h){
		if (i <= 20){
			return (Integer)h.get(i);
		} else {
			int sum = 0;
			sum += (Integer)h.get(i/10*10);
			sum += (Integer)h.get(i%10);
			return sum;
		}
	}
}
