public class SortingComparisons{
    public static void main(String[] args) {
		int[] testBubble = {64, 34, 25, 12, 22, 11, 90};
		int[] testQuick = {64, 34, 25, 12, 22, 11, 90};
		int[] testInsertion = {64, 34, 25, 12, 22, 11, 90};

		SortingAlgorithms.bubble(testBubble);
        SortingAlgorithms.quick(testQuick);
		SortingAlgorithms.insertion(testInsertion);

		for (int num : testBubble) {
			System.out.print(num + " ");
		}
	}
}