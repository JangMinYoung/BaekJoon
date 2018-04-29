package phase2;

import java.util.Scanner;

public class phase2_8 {
	public static void main(String args[]) {

		int result = 0;

		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		if (count >= 3) {
			if (count % 5 == 0) {
				result = count / 5;
				count = 0;
			} else {
				count = count - 3;
				result++;
			}
			while (count >= 3) {
				if (count % 5 == 0) {
					result += count / 5;
					count = 0;

				} else {
					result++;
					count = count - 3;
				}
			}
		}

		if (count == 0) {

		} else {
			result = -1;
		}
		System.out.println(result);

	}
}
