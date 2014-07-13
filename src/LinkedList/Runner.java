package LinkedList;

public class Runner {
	public static void main(String[] args) {
		//MyStack testing
		MyStack<Integer> stack = new MyStack<Integer>();
		System.out.println(stack.peek());
		stack.push(0);
		System.out.println(stack.peek());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		stack.push(7);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//MyQueue testing
		MyQueue<Integer> queue = new MyQueue<Integer>();
		queue.offer(1);
		System.out.println(queue.peek()); // 1
		System.out.println(queue.poll()); // 1
		System.out.println(queue.poll()); // null
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		System.out.println(queue.poll()); // 2
		System.out.println(queue.peek()); // 3
		System.out.println(queue.peek()); // 3
		System.out.println(queue.poll()); // 3
		queue.offer(6);
		queue.offer(7);
		queue.offer(8);
		System.out.println(queue.poll()); // 4
		System.out.println(queue.poll()); // 5
		System.out.println(queue.poll()); // 6
		System.out.println(queue.poll()); // 7
		System.out.println(queue.poll()); // 8
		System.out.println(queue.peek()); // null
		System.out.println(queue.poll()); // null
	}
}
