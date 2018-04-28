public class FirstKNaturalNumbers{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
		int temp = 0;
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();

		}
		// Sorting in Ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print(arr[0]);


}

}
