
public class stack {

	private int top;
	private int size;
	private String[] a;
	private int MAX_SIZE = 5;

	// Builds an empty array(Stack)
	public stack() {
		a = new String[MAX_SIZE];
		top = -1;
		size = 0;
	}

	// Builds an array(Stack) with a given element
	public stack(String s) {
		a = new String[MAX_SIZE];
		top = 0;
		size = 1;
	}

	// Prints out the top element
	public void peek() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println(a[top]);
		}
	}

	// Puts the given element at the top of the stack
	public void push(String e) {
		if (this.isFull()) {
			System.out.println("Stack is full");
		} else {
			a[++top] = e;
			size++;
		}
	}

	// Removes the top element and returns it to the user
	public void pop() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			size--;
			System.out.println(a[top--]);
		}
	}

	// Returns the size of the array
	public int size() {
		return size;
	}

	// Tests if the array is full, returns true or false
	public boolean isEmpty() {
		return (size == 0);
	}

	// Tests if the array is full, returns true or false
	public boolean isFull() {
		return (size == MAX_SIZE);
	}

	// Prints out all elements in the array
	public void print() {
		for (int i = 0; i < size; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(a[i]);
		}
		System.out.printf("%n");
	}

}
