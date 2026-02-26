// Armando Calzadilla 
// Steven Grundberg


public class SortingAlgorithms {

	// Bubble Sort
	public static void bubble(int[] arr){
		int n = arr.length;
		boolean swapped;
	
		for (int i = 0; i < n - 1; i++){
			swapped = false;

			for(int j = 0; j < n - i - 1; j++){
				if(arr[j] > arr[j + 1]){
				
					// Swap arr[j] and arr[j + 1]
					int temp = arr[j];
					arr[j] = arr[j+ 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
	}

	// Quick Sort
	public static void quick(int[] arr){
	}

	// Insertion Sort
	public static void insertion(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				int key = arr[i]
				if (key < arr[i-1]) {
					int temp = arr[i-1];
					arr[i-1] = key;
					key = temp;
				}
			}
		}
	}
}
