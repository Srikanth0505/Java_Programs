package myjava.interview.programs;

public class FindFirstOccuranceOfDuplicateNumberInArray {

	public static void main(String[] args) {
		int x[] = { 2, 5, 6, 3, 1, 4, 2, 4, 7 };
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					System.out.println("Duplicate Element: " + x[i]);
				}
			}
		}

	}

}
