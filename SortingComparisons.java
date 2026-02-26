public class SortingComparisons{
    public static void main(String[] args) {
		int[] test = {64, 34, 25, 12, 22, 11, 90};
<<<<<<< HEAD
		//SortingAlgorithms.bubble(test);

		int[] test2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		SortingAlgorithms.insertion(test);
=======
		SortingAlgorithms.bubble(test);
        SortingAlgorithms.quick(test);

		int[] test2 = {64, 34, 25, 12, 22, 11, 90};
		SortingAlgorithms.insertion(test2);
>>>>>>> 264c52e7b086c6b0d9761bb8dfb1c348f5579d16

		for (int num : test) {
			System.out.print(num + " ");
		}
	}
}