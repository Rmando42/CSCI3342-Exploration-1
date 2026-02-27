public class SortingComparisons{
    public static void main(String[] args) {
		//int n = (int)Math.pow(10, (Math.random() * 4) + 1);
		int n = 1000;
		System.out.println("n = " + n + "\n");
		int[] random = new int[n];
		for (int i = 0; i < n; i++) {
			random[i] = (int)(Math.random() * 999);
		}

		int[] sorted = new int[n];
		for (int i = 0; i < n; i++) {
			sorted[i] = i;
		}

		int[] unsorted = new int[n];
		for (int i = 0; i < n; i++) {
			unsorted[i] = n - i;
		}

		System.out.println("Randomly Generated Array: ");
		for (int num : random) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("Pre-Sorted Array: ");
		for (int num : sorted) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("Reverse-Sorted Array: ");
		for (int num : unsorted) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println();


		displayBubble(random, sorted, unsorted);
		displayQuick(random, sorted, unsorted);
		displayInsertion(random, sorted, unsorted);
		displayMerge(random, sorted, unsorted);
		displaySelection(random, sorted, unsorted);
		
		/*int[] quickRandom = random.clone();
		int[] insertionRandom = random.clone();
		int[] mergeRandom = random.clone();
		int[] selectionRandom = random.clone();*/

        /*SortingAlgorithms.quick(testQuick);
		SortingAlgorithms.insertion(testInsertion);
		SortingAlgorithms.merge(testMerge);
		SortingAlgorithms.selection(testSelection);
		for (int num : testBubble) {
			System.out.print(num + " ");
		}*/
	}

	public static void displayBubble(int[] random, int[] sorted, int[] unsorted) {
		int[] bubbleRandom = random.clone();
		int[] bubbleSorted = sorted.clone();
		int[] bubbleUnsorted = unsorted.clone();

		long timeRandomStart = System.nanoTime();
		SortingAlgorithms.bubble(bubbleRandom);
		long timeRandomEnd = System.nanoTime();
		System.out.println("Time taken for bubble sort to sort random array: " + (timeRandomEnd - timeRandomStart) + " nanoseconds");

		long timeSortedStart = System.nanoTime();
		SortingAlgorithms.bubble(bubbleSorted);
		long timeSortedEnd = System.nanoTime();
		System.out.println("Time taken for bubble sort to sort sorted array: " + (timeSortedEnd - timeSortedStart) + " nanoseconds");

		long timeUnsortedStart = System.nanoTime();
		SortingAlgorithms.bubble(bubbleUnsorted);
		long timeUnsortedEnd = System.nanoTime();
		System.out.println("Time taken for bubble sort to sort reverse array: " + (timeUnsortedEnd - timeUnsortedStart) + " nanoseconds");

		System.out.println();
	}

	public static void displayQuick(int[] random, int[] sorted, int[] unsorted) {
		int[] quickRandom = random.clone();
		int[] quickSorted = sorted.clone();
		int[] quickUnsorted = unsorted.clone();

		long timeRandomStart = System.nanoTime();
		SortingAlgorithms.quick(quickRandom);
		long timeRandomEnd = System.nanoTime();
		System.out.println("Time taken for quick sort to sort random array: " + (timeRandomEnd - timeRandomStart) + " nanoseconds");

		long timeSortedStart = System.nanoTime();
		SortingAlgorithms.quick(quickSorted);
		long timeSortedEnd = System.nanoTime();
		System.out.println("Time taken for quick sort to sort sorted array: " + (timeSortedEnd - timeSortedStart) + " nanoseconds");

		long timeUnsortedStart = System.nanoTime();
		SortingAlgorithms.quick(quickUnsorted);
		long timeUnsortedEnd = System.nanoTime();
		System.out.println("Time taken for quick sort to sort reverse array: " + (timeUnsortedEnd - timeUnsortedStart) + " nanoseconds");

		System.out.println();
	}

	public static void displayInsertion(int[] random, int[] sorted, int[] unsorted) {
		int[] insertionRandom = random.clone();
		int[] insertionSorted = sorted.clone();
		int[] insertionUnsorted = unsorted.clone();

		long timeRandomStart = System.nanoTime();
		SortingAlgorithms.insertion(insertionRandom);
		long timeRandomEnd = System.nanoTime();
		System.out.println("Time taken for insertion sort to sort random array: " + (timeRandomEnd - timeRandomStart) + " nanoseconds");

		long timeSortedStart = System.nanoTime();
		SortingAlgorithms.insertion(insertionSorted);
		long timeSortedEnd = System.nanoTime();
		System.out.println("Time taken for insertion sort to sort sorted array: " + (timeSortedEnd - timeSortedStart) + " nanoseconds");

		long timeUnsortedStart = System.nanoTime();
		SortingAlgorithms.insertion(insertionUnsorted);
		long timeUnsortedEnd = System.nanoTime();
		System.out.println("Time taken for insertion sort to sort reverse array: " + (timeUnsortedEnd - timeUnsortedStart) + " nanoseconds");

		System.out.println();
	}

	public static void displayMerge(int[] random, int[] sorted, int[] unsorted) {
		int[] mergeRandom = random.clone();
		int[] mergeSorted = sorted.clone();
		int[] mergeUnsorted = unsorted.clone();

		long timeRandomStart = System.nanoTime();
		SortingAlgorithms.merge(mergeRandom);
		long timeRandomEnd = System.nanoTime();
		System.out.println("Time taken for merge sort to sort random array: " + (timeRandomEnd - timeRandomStart) + " nanoseconds");

		long timeSortedStart = System.nanoTime();
		SortingAlgorithms.merge(mergeSorted);
		long timeSortedEnd = System.nanoTime();
		System.out.println("Time taken for merge sort to sort sorted array: " + (timeSortedEnd - timeSortedStart) + " nanoseconds");

		long timeUnsortedStart = System.nanoTime();
		SortingAlgorithms.merge(mergeUnsorted);
		long timeUnsortedEnd = System.nanoTime();
		System.out.println("Time taken for merge sort to sort reverse array: " + (timeUnsortedEnd - timeUnsortedStart) + " nanoseconds");

		System.out.println();
	}

	public static void displaySelection(int[] random, int[] sorted, int[] unsorted) {
		int[] selectionRandom = random.clone();
		int[] selectionSorted = sorted.clone();
		int[] selectionUnsorted = unsorted.clone();

		long timeRandomStart = System.nanoTime();
		SortingAlgorithms.selection(selectionRandom);
		long timeRandomEnd = System.nanoTime();
		System.out.println("Time taken for selection sort to sort random array: " + (timeRandomEnd - timeRandomStart) + " nanoseconds");

		long timeSortedStart = System.nanoTime();
		SortingAlgorithms.selection(selectionSorted);
		long timeSortedEnd = System.nanoTime();
		System.out.println("Time taken for selection sort to sort sorted array: " + (timeSortedEnd - timeSortedStart) + " nanoseconds");

		long timeUnsortedStart = System.nanoTime();
		SortingAlgorithms.selection(selectionUnsorted);
		long timeUnsortedEnd = System.nanoTime();
		System.out.println("Time taken for selection sort to sort reverse array: " + (timeUnsortedEnd - timeUnsortedStart) + " nanoseconds");

		System.out.println();
	}
}