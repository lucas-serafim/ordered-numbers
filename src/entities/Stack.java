package entities;

public class Stack {
	private int elements[];
	private int top;
	
	public Stack() {
		elements = new int[5];
		top = -1;
	}
	
	public void push(int number) {
		top++;
		elements[top] = number;
	}
	
	public int remove() {
		int value;
		
		value = elements[top];
		
		top--;
		
		return value;
	}
	
	public int top() {
		return elements[top];
	}
	
	public int total() {
		return elements.length;
	}
//	public boolean isEmpty() {
//		if (top == -1) {
//			return true;
//		}
//		
//		return false;
//	}
//	
//	public boolean isFull() {
//		return (top == elements.length - 1);
//	}
//	
}