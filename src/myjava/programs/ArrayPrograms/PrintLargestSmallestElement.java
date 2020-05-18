package myjava.programs.ArrayPrograms;

public class PrintLargestSmallestElement {

	public static void main(String[] args) {

		int[] arr = new int[] { 25, 11, 7, 75, 56, 101 };
		int max = arr[0];
		int small = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max valued element in given array = " + max);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println("Min valued element in given array = " + small);

		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			count++;
		}
		System.out.println("No of elements in array = " + count);

	}
}
