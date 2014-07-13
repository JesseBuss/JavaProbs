package Arrays;

public class Runner {
	public static void main(String[] args) {
		// ArrayStack tester
		ArrayStack mArrayStack = new ArrayStack();
		mArrayStack.push(1);
		System.out.println(mArrayStack.peek());// 1
		mArrayStack.push(2);
		mArrayStack.push(3);
		mArrayStack.push(4);
		System.out.println(mArrayStack.peek());// 4
		System.out.println(mArrayStack.pop()); // 4
		System.out.println(mArrayStack.pop()); // 3
		System.out.println(mArrayStack.pop()); // 2
		System.out.println(mArrayStack.peek());// 1
		System.out.println(mArrayStack.pop()); // 1
		System.out.println(mArrayStack.pop()); // Integer.Min
		System.out.println(mArrayStack.pop()); // Integer.Min
		mArrayStack.push(5);
		mArrayStack.push(6);
		mArrayStack.push(7);
		mArrayStack.push(8);
		mArrayStack.push(9);
		mArrayStack.push(10);
		mArrayStack.push(11);
		mArrayStack.push(12);
		System.out.println(mArrayStack.pop()); // 12
		System.out.println(mArrayStack.peek());// 11
		System.out.println(mArrayStack.pop()); // 11
		System.out.println(mArrayStack.pop()); // 10
		System.out.println(mArrayStack.pop()); // 9
		System.out.println(mArrayStack.pop()); // 8
		System.out.println(mArrayStack.pop()); // 7
		System.out.println(mArrayStack.pop()); // 6
		System.out.println(mArrayStack.pop()); // 5
		System.out.println(mArrayStack.pop()); // Integer.Min
		System.out.println(mArrayStack.peek());// Integer.Min
		System.out.println(mArrayStack.peek());// Integer.Min
		System.out.println(mArrayStack.pop()); // Integer.Min
	}
}
