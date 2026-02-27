public class SortingComparisons{
    public static void main(String[] args) {
		int[] testBubble = {64, 34, 25, 12, 22, 11, 90};
		int[] testQuick = {64, 34, 25, 12, 22, 11, 90};
		int[] testInsertion = {64, 34, 25, 12, 22, 11, 90};
		int[] testMerge = {64, 34, 25, 12, 22, 11, 90};
		int[] testSelection = {64, 34, 25, 12, 22, 11, 90};

		SortingAlgorithms.bubble(testBubble);
        SortingAlgorithms.quick(testQuick);
		SortingAlgorithms.insertion(testInsertion);
		SortingAlgorithms.merge(testMerge);
		SortingAlgorithms.selection(testSelection);
		for (int num : testBubble) {
			System.out.print(num + " ");
		}
	}
}