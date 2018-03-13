
public class Array {

	//Variables
	private int[] a;	
	private int nElems;

	//Array constructor
	public Array(int max) {
		a = new int[max];	
		nElems = 0;
	}
	//Searches for given element value. Returns the index if found or notifies if not
	public void search(long searchKey) {
		int j;
		for (j = 0; j < nElems; j++)		
			if (a[j] == searchKey)			
				break;					
		if (j == nElems)
			System.out.println("Element not found");
		else {
			System.out.println("Element found at index: " + j);

		}
	}
	//Displays the array elements
	public void display() {
		for(int j=0; j < nElems; j++)
			System.out.println(a[j] + " ");		
		System.out.println(" ");
	}
	//Inserts elements into the indexes. Tacks them onto end
	public void insert(int value) {
		a[nElems] = value;		
		nElems++;				
	}
	//Sorts the elements from least to greatest
	public void bubbleSort() {
		int n = nElems;
		int temp = 0;
		for (int i = 0; i < n; i++) {		//Sort
			for (int j = 1; j < (n - i); j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}	
}
