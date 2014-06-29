package LinkedList;

//I'm using a generic Node class, use int, String, etc. if you'd like.
public class Node<E> {
	public Node<E> next;
	public E data;
	
	public Node(Node<E> next, E data){
		this.next = next;
		this.data = data;
	}
	
	public Node(){
		this.next = null;
		this.data = null;
	}
	
	public E getData(){
		return data;
	}
	
	public Node<E> getNext(){
		return next;
	}
}
