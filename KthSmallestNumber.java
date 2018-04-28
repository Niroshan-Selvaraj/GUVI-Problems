public class KthSmallestNumber{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		int temp = 0;
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
		}

		// Sort the number in ascending order
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}

		System.out.println(arr[K - 1]);

}

}
