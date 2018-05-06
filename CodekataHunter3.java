public class CodekataHunter3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		int resultArraySize = 0;

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == arr[i]) {
				resultArraySize++;
			}
		}
		int resultArray[] = new int[resultArraySize];

		for (int i = 0; i < arr.length; i++) {
			if (i == arr[i]) {
				resultArray[index++] = i;
			}
		}
		int temp = 0;
		// Arrays.sort(resultArray);
		for (int i = 0; i < resultArray.length - 1; i++) {
			for (int j = i + 1; j < resultArray.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + " ");
		}
	}
}
