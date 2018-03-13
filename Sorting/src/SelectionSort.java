
public class SelectionSort {
//Created by Brady Chiles
	public static void main(String[] args) {
		
		int[] numbers = {8, 6, 5, 2, 1, 3};
		
		selectionSort(numbers);
		printArray(numbers);

	}
	//creating an integer array method and pass
	//an integer array A as a parameter
	public static int[] selectionSort(int[] A){
		//loops through the array
		for(int i=0; i<A.length; i++){
			int minIndex = i;
			for(int j=i+1; j<A.length; j++){
				if(A[j]<A[minIndex]){
					minIndex=j;
				}
			}
			int temp=A[minIndex];
			A[minIndex] = A[i];
			A[i] = temp;
		}
		return A;
	}
	//Prints the array
	public static void printArray(int[] A){
		for (int i=0; i<A.length; i++){
			System.out.println(A[i]);
		}
	}

}
