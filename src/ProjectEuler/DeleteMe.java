package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;


public class DeleteMe {
	public static void main(String[] args){
		//problem11(); **Solved**
		//problem12(); **Solved**
		//problem13(); //**Solved**
		//problem14(); //**Solved**
		//problem15();
		//problem16(); **Solved**
		//problem17(); //**Solved**
		//problem18(); **Solved**
		//problem19(); //**Solved**
		//problem20(); **Solved**
	}
	
	public static void problem11(){
		String sMatrix = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08" +
				" 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00" +
				" 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65" +
				" 52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91" +
				" 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80" +
				" 24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50" +
				" 32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70" +
				" 67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21" +
				" 24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72" +
				" 21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95" +
				" 78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92" +
				" 16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57" +
				" 86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58" +
				" 19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40" +
				" 04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66" +
				" 88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69" +
				" 04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36" +
				" 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16" +
				" 20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54" +
				" 01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";
		Scanner s = new Scanner(sMatrix);
		int[][] matrix = new int[20][20];
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				matrix[i][j] = s.nextInt();
			}
		}
		double max = 0;
		double d = 0;
		
		//Left-to-Right Search
		for(int i = 0; i < 20; i++){
			for(int j = 3; j < 20; j++){
				d=  matrix[i][j-3]*matrix[i][j-2]*matrix[i][j-1]*matrix[i][j];
				if (d > max)
					max = d;
			}
		}
		
		//Top-to-Bottom Search
		for(int i = 3; i < 20; i++){
			for (int j = 0; j < 20; j++){
				d = matrix[i-3][j]*matrix[i-2][j]*matrix[i-1][j]*matrix[i][j];
				if (d > max)
					max = d;
			}
		}
		
		//Diagonal top left to bottom right
		for (int i = 3; i < 20; i++){
			for (int j = 3; j < 20; j++){
				d = matrix[i-3][j-3]*matrix[i-2][j-2]*matrix[i-1][j-1]*matrix[i][j];
				if (d > max)
					max = d;
			}
		}
		
		//Diagonal top right to bottom left
		for(int i = 3; i < 20; i++){
			for (int j = 3; j < 20; j++){
				d = matrix[i-3][j]*matrix[i-2][j-1]*matrix[i-1][j-2]*matrix[i][j-3];
				if (d > max)
					max = d;
			}
		}
		System.out.println("Problem 11 solution = " + (int)max);
	}

	public static void problem12(){
		List<Integer> triangles = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 1; i < 20000; i++){
			sum += i;
			triangles.add(sum);
		}
		int count = 1;
		for (Integer last : triangles) {
			for (double i = 1; i <= Math.sqrt(last); i++) {
				if (last / i % 1 == 0)
					count += 2;
				if (i == Math.sqrt(last))
					count--;
			}
			if (count >= 500){
				System.out.println("Problem 12 result = " + last);
				return;
			}
			count = 0;
		}
	}

	public static void problem13(){
		Scanner s = new Scanner(System.in);
		BigInteger[] input = new BigInteger[100];
		BigInteger sum = new BigInteger("12");
		for(int i = 0; i < 100; i++){
			input[i] = new BigInteger(s.next());
			sum = sum.add(input[i]);
		}
		System.out.println(sum);
	}

	public static void problem14(){
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
	
	public static void problem15(){
		
	}
	
	public static void problem16(){
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
	
	private static void problem17(){
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
		int temp = 0;
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

	private static void problem18(){
		String[] input = { 
										 "75",
										"95 64",
									  "17 47 82",
				  					 "18 35 87 10",
									"20 04 82 47 65",
								  "19 01 23 75 03 34",
								"88 02 77 73 07 63 67",
							  "99 65 04 28 06 16 70 92",
							"41 41 26 56 83 40 80 70 33",
				  		  "41 48 72 33 47 32 37 16 94 29",
						"53 71 44 65 25 43 91 52 97 51 14",
					  "70 11 33 28 77 73 17 78 39 68 17 57",
					"91 71 52 38 17 14 91 43 58 50 27 29 48",
				  "63 66 04 68 89 53 67 30 73 16 69 87 40 31",
				"04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"};
		Node root = new Node(75);
		makeTree(root, 1, 0, input);
		List<Integer> sums = new ArrayList<Integer>();
		traverseTree(root, 0, sums);
		int max = 0;
		for (int i: sums){
			if (i > max)
				max = i;
		}
		System.out.println("Max = " + max);
	}
	
	private static void makeTree(Node n, int row, int col, String[] str){
		if (row == str.length)
			return;
		Scanner s = new Scanner(str[row]);
		for(int i = 0; i < col; i++){
			s.nextInt();
		}
		n.left = new Node(s.nextInt());
		makeTree(n.left, row+1, col, str);
		n.right = new Node (s.nextInt());
		makeTree(n.right, row+1, col+1, str);
	}

	private static void traverseTree(Node n, int sum, List<Integer> sums){
		if (n == null){
			sums.add(sum);
		}
		else {
			traverseTree(n.left, sum+n.val, sums);
			traverseTree(n.right, sum+n.val, sums);
		}
	}
	
	private static void problem19(){
		Calendar c = Calendar.getInstance();
		c.set(1901, Calendar.JANUARY, 0);
		int sum = 0;
		for (int i = 1901; i <= 2000; i++){
			for (int j = 0; j < 12; j++){
				c.set(c.YEAR, i);
				c.set(c.MONTH, j);
				c.set(c.DAY_OF_MONTH, 1);
				if (c.get(c.DAY_OF_WEEK) == c.SUNDAY)
				{
					sum++;
				}
			}
		}
		System.out.println("Sum = " + sum);
	}
	
	public static void problem20(){
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
