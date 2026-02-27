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
        quickHelper(arr, 0, arr.length - 1);
	}

    // Helper method
    private  static void quickHelper(int[] arr, int low, int high){
        if (low < high){
            int pivotIndex = partition(arr, low, high);

            quickHelper(arr, low, pivotIndex - 1);
            quickHelper(arr, pivotIndex + 1, high);
        }
    }

    // Partition method
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++){
            if (arr[j] <= pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

	// Insertion Sort
	public static void insertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int eleSort = 1;
			int keySort = 0;
			while ((i-eleSort) >= 0 && arr[i-keySort] < arr[i-eleSort]) {
				int temp = arr[i-keySort];
				arr[i-keySort] = arr[i-eleSort];
				arr[i-eleSort] = temp;
				eleSort++;
				keySort++;
			}
			eleSort = 1;
		}
	}

		// Selection Sort
	public static void selection(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;	
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}


	// Merge Sort
	public static void merge(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int mid = arr.length / 2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int i = mid; i < arr.length; i++) {
			right[i - mid] = arr[i];
		}
		merge(left);
		merge(right);
		mergeArrays(arr, left, right);
	}

	// Helper method for merge sort
	private static void mergeArrays(int[] arr, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		// Merge the two arrays
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		// Copy the remaining elements of left[], if there are any
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		// Copy the remaining elements of right[], if there are any
		while (j < right.length) {
			arr[k++] = right[j++];
		}
	}
}
