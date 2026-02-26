public class SortingComparisons{
    public static void main(String[] args) {
		int[] test = {64, 34, 25, 12, 22, 11, 90};
		//SortingAlgorithms.bubble(test);

		int[] test2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		SortingAlgorithms.insertion(test);

		for (int num : test) {
			System.out.print(num + " ");
		}
	}
}