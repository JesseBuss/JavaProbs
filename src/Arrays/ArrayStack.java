package Arrays;

import java.util.Arrays;

public class ArrayStack {
	//Value to return if the stack is empty.
	private final int EMPTY_STACK = Integer.MIN_VALUE;
	
	//Keep class variables private, people using the ArrayStack
	//class should not care about behind-the-scenes implementation.
	private int[] values; // everything pushed on the stack.
	private int position; // pointer to keep track of where we are.
	
	public ArrayStack(int capacity){
		values = new int[capacity];
		position = 0;
	}
	
	public ArrayStack(){
		//default to 5 for now, could be anything though.
		values = new int[5];
		position = 0;
	}
	
	public void push(int value){
		ensureCapacity();
		values[position] = value;
		position++;
	}
	
	public int pop(){
		if (position == 0) {
			return EMPTY_STACK;
		}
		else{
			position--;
			return values[position];
		}
	}
	
	public int peek(){
		if (position == 0)
			return EMPTY_STACK;
		else
			return values[position - 1];
	}
	
	//Keep this method private.
	private void ensureCapacity(){
		if (position == values.length){
			//helper method that makes a copy of an array
			//2nd parameter is the length of the new array.
			values = Arrays.copyOf(values, values.length*2);
		}
	}
}
