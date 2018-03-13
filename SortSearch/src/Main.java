
public class Main {

	public static void main(String[] args) {
		
		Array arr = new Array(100);
		
		arr.insert(77);
		arr.insert(66);
		arr.insert(55);
		arr.insert(88);
		arr.insert(99);
		arr.insert(22);
		arr.insert(33);
		
		arr.bubbleSort();
		arr.display();
		arr.search(66);
		
		

	}
}
