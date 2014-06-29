package LinkedList;

public class MyStack<E> {
	private Node<E> head;
	
	public void push(E dataToPush){
		if (head == null){
			head = new Node<E>(null, dataToPush);
		} else {
			Node<E> tmp = new Node<E>(head, dataToPush);
			head = tmp;
		}
	}
	
	public E peek(){
		if (head == null)
			return null;
		return head.getData();
	}
	
	public E pop(){
		if (head == null)
			return null;
		E result = head.getData();
		head = head.getNext();
		return result;
	}
}
