import java.util.Scanner;

public class CodekataHunter4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		int uniqueNumber = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 0;

			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
				if (count > 1)
					break;
			}
			if (count == 1) {
				uniqueNumber = arr[i];
				break;
			}

		}
		if (count == 1) {
			System.out.println(uniqueNumber);
		}
	}
}
