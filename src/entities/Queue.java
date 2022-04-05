package entities;

public class Queue {
	private int[] values;
	private int first = 0;
	private int last = 0;
	private int total = 0;
	
	public Queue() {
		values = new int[10];
	}
	
	public void push(int number) {
		values[last] = number;
		last = (last + 1) % values.length;
		total++;
	}
	
	public void remove() {
		first = (first + 1) % values.length;
		total--;
	}
	
	public int[] elements() {
		return values;
	}
}
