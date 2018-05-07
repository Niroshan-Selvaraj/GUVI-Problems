import java.util.Scanner;
public class CodekataHunter1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		int count = 0;

		int duplicateCount = 0;
		boolean checkDuplicate = false;
		int resultArray[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicateCount++;
					for (int k = 0; k < resultArray.length; k++) {
						if (arr[i] != resultArray[k]) {
							checkDuplicate = false;

						} else {
							checkDuplicate = true;
						}
					}
					if (!checkDuplicate)
						resultArray[count++] = arr[i];
				}
			}
		}
		if (duplicateCount < 1) {
			System.out.println("unique");
		} else {
			for (int i = 0; i < resultArray.length; i++) {
				if (resultArray[i] == 0 && resultArray[i + 1] == 0)
					break;
				else
					System.out.print(resultArray[i] + " ");
			}
		}

	}
}
