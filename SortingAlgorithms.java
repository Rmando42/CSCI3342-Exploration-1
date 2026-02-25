//Armando Calzadilla 


public class SortingAlgorithms {
	
	// Bubble Sort
	public static void bubble(int[] arr){
		int n = arr.length;
		boolean swapped;
		int temp;
	
		for (int i = 0; i < n - 1; i++){
			swapped = false;

			for(int j = 0; j < n - i - 1; j++){
				if(arr[j] > arr[j + 1]){
				
					// Swap arr[j] and arr[j + 1]
					temp = arr[j];
					arr[j] = arr[j+ 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}
	}

	// Quick Sort
	public static void quick(int[] arr){
	}

}
