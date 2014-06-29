package Trees;

import java.util.Stack;

public class IterativeTraversal {
	public static void main(String[] args) {
		TreeNode tn50 = new TreeNode(50);
		TreeNode tn25 = new TreeNode(25);
		TreeNode tn10 = new TreeNode(10);
		TreeNode tn30 = new TreeNode(30);
		TreeNode tn100 = new TreeNode(100);
		TreeNode tn75 = new TreeNode(75);
		TreeNode tn200 = new TreeNode(200);

		tn50.left = tn25;
		tn25.left = tn10;
		tn25.right = tn30;
		tn50.right = tn100;
		tn100.left = tn75;
		tn100.right = tn200;

		iterativeTraversal(tn50);
	}

	private static void iterativeTraversal(TreeNode root) {
		TreeNode helper = root;
		Stack<TreeNode> myStack = new Stack<TreeNode>();
		myStack.push(helper);
		while (myStack.isEmpty() == false) {
			helper = myStack.pop();
			if (helper == null)
				break;
			
			System.out.print(helper.data + " ");
			
			if (helper.right != null)
				myStack.push(helper.right);
			if (helper.left != null)
				myStack.push(helper.left);
		}
	}
}
