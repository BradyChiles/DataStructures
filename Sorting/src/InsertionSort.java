
public class InsertionSort {
//Created by Brady Chiles
	public static void main(String[] args) {
		//Build array
		int[] numbers = {6, 7, 5, 3, 9, 15};
		
		insertionSort(numbers);
		printArray(numbers);
	}

	//takes integer array to be sorted
	public static int[] insertionSort(int[] A){
		//loops through the array
		for (int i = 1; i<A.length; i++){
			//key starts at second element
			int key = A[i];
			//j starts at first element
			int j = i - 1;
			//A[j] sorted elements, A[i] unsorted elements
			while(j >= 0 && A[j] > key){
				//puts first element in the second place
				A[j + 1] = A[j];
				//j=0, when subtract 1 it terminates the loop
				j--;
			}
			//puts the key in the first place
			A[j + 1] = key;
		}
		return A;
	}
	//Prints the array
	public static void printArray(int[] A){
		for (int i = 0; i < A.length; i++){
			System.out.println(A[i]);
		}
	}
}
