import java.util.Scanner;
public class CodekataHunter2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		 StringBuilder result = new StringBuilder();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			
			arr[i] = input.nextInt();
		}
		int temp = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
for(int i=0;i<arr.length;i++){
	result.append(arr[i]);
	
}
System.out.println(result.toString());
	}
}
