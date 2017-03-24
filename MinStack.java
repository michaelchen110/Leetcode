import java.util.*;

public class MinStack {

	public static void main(String[] args) {
		MinStack tester = new MinStack();
		tester.unitTest();
	}
	public void unitTest() {
		MinStack minStack = new MinStack();
		minStack.push(1200);
		minStack.push(-1024);
		minStack.push(-1024);
		minStack.push(1200);
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
	}
	/** initialize your data structure here. */
	Stack<Integer> stack;
	Stack<Integer> min;
	public MinStack() {
		stack = new Stack<>();
		min = new Stack<>();
	}

	public void push(int x) {
		stack.push(x);
		if (min.empty() || min.peek() >= x) min.push(x);
	}

	public void pop() {
		if (stack.empty()) return;
		if (min.peek().equals(stack.pop())) min.pop();
	}

	public int top() {
		return stack.empty() ? Integer.MAX_VALUE : stack.peek();
	}

	public int getMin() {
		return min.empty() ? Integer.MAX_VALUE : min.peek();
	}

}
