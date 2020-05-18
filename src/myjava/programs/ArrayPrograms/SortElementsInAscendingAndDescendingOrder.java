package myjava.programs.ArrayPrograms;

public class SortElementsInAscendingAndDescendingOrder {

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 2, 8, 7, 1 };
		int temp = 0;
		System.out.print("Original Array :: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted in Ascending Order Array :: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted in Descending Order Array :: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		
	}

}
