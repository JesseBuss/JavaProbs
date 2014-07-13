package LinkedList;

public class MyQueue<E> {
	private Node<E> head;
	private Node<E> tail;
	
	public void offer(E data){
		Node<E> tmp = new Node<E>(null, data);
		if (head == null && tail == null){
			head = tmp;
			tail = tmp;
		} else{
			tail.next = tmp;
			tail = tmp;
		}
	}
	
	public E peek(){
		if (head == null)
			return null;
		return head.data;
	}
	
	public E poll(){
		E result = null;
		if (head == null){
			return null;
		} else if (head == tail){
			result = head.data;
			head = null;
			tail = null;
		} else {
			result = head.data;
			head = head.next;
		}
		return result;
	}
}
