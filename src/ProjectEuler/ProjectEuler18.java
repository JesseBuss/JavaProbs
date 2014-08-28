package ProjectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Trees.TreeNode;

public class ProjectEuler18 {
	public static void main(String[] args){
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
		TreeNode root = new TreeNode(75);
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
	
	@SuppressWarnings("resource")
	private static void makeTree(TreeNode n, int row, int col, String[] str){
		if (row == str.length)
			return;
		Scanner s = new Scanner(str[row]);
		for(int i = 0; i < col; i++){
			s.nextInt();
		}
		n.left = new TreeNode(s.nextInt());
		makeTree(n.left, row+1, col, str);
		n.right = new TreeNode (s.nextInt());
		makeTree(n.right, row+1, col+1, str);
	}

	private static void traverseTree(TreeNode n, int sum, List<Integer> sums){
		if (n == null){
			sums.add(sum);
		}
		else {
			traverseTree(n.left, sum+n.data, sums);
			traverseTree(n.right, sum+n.data, sums);
		}
	}
}
