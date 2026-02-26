public class SortingComparisons{
    public static void main(String[] args) {
		int[] test = {64, 34, 25, 12, 22, 11, 90};
		SortingAlgorithms.bubble(test);
        SortingAlgorithms.quick(test);

		int[] test2 = {64, 34, 25, 12, 22, 11, 90};
		SortingAlgorithms.insertion(test2);

		for (int num : test) {
			System.out.print(num + " ");
		}
	}
}