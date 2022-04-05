package program;

import entities.Queue;
import entities.Stack;

public class Main {
	public static void main(String[] args) {
		int[] list = new int[5];
		Stack stack = new Stack();
		Queue queue = new Queue();
		
		// ---- 1 ----
		for (int i = 0; i < list.length; i++) {
			list[i] = i + 1;
		}

		// ---- 2 ----
		for (int i = 0; i < stack.total(); i++) {
			stack.push(list[i]);

			list[i] = 0;
		}

		// ---- 3 ----
		for (int i = 0; i < stack.total(); i++) {
			int value = stack.remove();		
			queue.push(value);
		}
		
		// ---- 4 ----
		for (int i = 0; i < 5; i++) {
			list[i] = list.length + 1 + i;
		}
		
		// ---- 5 ----
		for (int i = 0; i < stack.total(); i++) {
			stack.push(list[i]);
			list[i] = 0;
		}
		
		for (int i = 0; i < stack.total(); i++) {
			int value = stack.remove();
			queue.push(value);
		}
		
		// ---- 6 ----
		int elements[] = queue.elements();
		
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
	}
}