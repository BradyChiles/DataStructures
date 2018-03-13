
public class stackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stack animals = new stack();
		animals.push("dog");
		animals.push("cat");
		animals.push("mouse");
		animals.push("pig");
		animals.push("bird");
		System.out.println(animals.size());
		animals.push("puppy");
		System.out.println(animals.size());
		animals.pop();
		animals.pop();
		System.out.println(animals.size());
		animals.pop();
		animals.peek();
		animals.pop();
		animals.pop();
		System.out.println(animals.size());
		System.out.println(animals.isEmpty());
	}

}
