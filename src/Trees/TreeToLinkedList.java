package Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class TreeToLinkedList {
	public static void main(String[] args){
		TreeNode head = new TreeNode(22);
		TreeNode tn45 = new TreeNode(45);
		TreeNode tn46 = new TreeNode(46);
		TreeNode tn55 = new TreeNode(55);
		TreeNode tn56 = new TreeNode(56);
		TreeNode tn57 = new TreeNode(57);
		TreeNode tn58 = new TreeNode(58);
		TreeNode tn64 = new TreeNode(64);
		TreeNode tn65 = new TreeNode(65);
		TreeNode tn70 = new TreeNode(70);
		
		head.left = tn45;
		head.right = tn46;
		tn45.left = tn55;
		tn45.right = tn56;
		tn46.left = tn57;
		tn46.right = tn58;
		tn55.right = tn64;
		tn58.right = tn65;
		tn65.right = tn70;
		
		//We will be implementing this method in steps 3-5.
		HashMap<Integer, LinkedList<Integer>> h = getLinkedListsFromTree(head);
		
		//We will be implementing this method in step 7
		printLinkedLists(h);
	}
	
	private static HashMap<Integer, LinkedList<Integer>> getLinkedListsFromTree(TreeNode head){
		HashMap<Integer, LinkedList<Integer>> result = new HashMap<Integer, LinkedList<Integer>>();
		traverseTree(head, result, 1);
		return result;
	}
	
	private static void traverseTree(TreeNode node, HashMap<Integer, LinkedList<Integer>> linkedLists, int level){
		if (node == null)
			return;
		if (linkedLists.containsKey(level)){
			linkedLists.get(level).add(node.data);
		} else {
			LinkedList<Integer> tempLinkedList = new LinkedList<Integer>();
			tempLinkedList.add(node.data);
			linkedLists.put(level, tempLinkedList);
		}
		if (node.left != null)
			traverseTree(node.left, linkedLists, level + 1);
		if (node.right != null)
			traverseTree(node.right, linkedLists, level + 1);
	}
	
	private static void printLinkedLists(HashMap<Integer, LinkedList<Integer>> linkedLists){
		for(Entry<Integer, LinkedList<Integer>> list: linkedLists.entrySet()){
			for(int i = 0; i < list.getValue().size(); i++){
				System.out.print(list.getValue().get(i) + " -> ");
			}
			System.out.println("null");
		}
	}
}
















