
public class BubbleSort {
//Created by Brady Chiles
	public static void main(String[] args) {
		
		int[] numbers = {23, 13, 5, 12, 9, 11};
		bubbleSort(numbers);
		printArray(numbers);

	}
//Passes in a integer array to be sorted
	public static int[] bubbleSort(int[] A){
		//loops through array
		for (int i = 0; i < A.length; i++){
			//compares array elements
			for(int j = 0; j < A.length; j++){
				//compares the element and the one above
				if(A[j] > A[j+1]){
					//If element to the left is larger
					//Store it in temp variable
					int temp = A[j+1];
					//element to right is replaced with left
					A[j+1] = A[j];
					//element to left is replaced by right
					A[j] = temp;
				}
			}
		}
		return A;
	}
	//prints array
	public static void printArray(int[] A){
		for (int i = 0; i < A.length; i++){
			System.out.println(A[i]);
		}
	}
}
