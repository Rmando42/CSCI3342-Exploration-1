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
    public static void quickHelper(int[] arr, int low, int high){
        if (low < high){
            int pivotIndex = partition(arr, low, high);

            quickHelper(arr, low, pivotIndex - 1);
            quickHelper(arr, pivotIndex + 1, high);
        }
    }

    // Partition method
    public static int partition(int[] arr, int low, int high){
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
<<<<<<< HEAD
		for (int i = 1; i < arr.length; i++) {
			int eleSort = 1;
			int keySort = 0;
			while ((i-eleSort) >= 0 && arr[i-keySort] < arr[i-eleSort]) {
				int temp = arr[i-keySort];
				arr[i-keySort] = arr[i-eleSort];
				arr[i-eleSort] = temp;
				eleSort++;
				keySort++;
=======
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				int key = arr[i];
				if (key < arr[i-1]) {
					int temp = arr[i-1];
					arr[i-1] = key;
					key = temp;
				}
>>>>>>> 264c52e7b086c6b0d9761bb8dfb1c348f5579d16
			}
			eleSort = 1;
		}
	}
}
