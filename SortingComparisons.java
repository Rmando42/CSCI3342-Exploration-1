public class SortingComparisons{
    public static void main(String[] args) {
		int[] test = {64, 34, 25, 12, 22, 11, 90};
		SortingAlgorithms.bubble(test);

		for (int num : test) {
			System.out.print(num + " ");
		}
	}
}