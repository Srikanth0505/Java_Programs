package myjava.programs;

/*
 * Program for finding common integers between two Sorted arrays
 * 
 *  int[] input1 = {2,7,17,19,20,45,56,159,239};
 *  int[] intput2 = {7,12,15,19,22,34,55,150,159};
 */
public class FindCommonIntegersBW2SortedArrays {

	public static void main(String[] args) {

		int[] input1 = { 2, 7, 17, 19, 20, 45, 56, 159, 239 };
		int[] intput2 = { 7, 12, 15, 19, 22, 34, 55, 150, 159 };
		int index1 = 0;
		int index2 = 0;
		while (true) {
			if (index1 >= input1.length || index2 >= intput2.length) {
				break;
			}
			if (input1[index1] == intput2[index2]) {
				System.out.print(input1[index1]);
				System.out.print("  ");
				index1 += 1;
			} else if (input1[index1] < intput2[index2]) {
				index1 += 1;
			} else {
				index2 += 1;
			}
		}

	}

}
