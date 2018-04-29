public class LongestCommanPrefix{
public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		int bigStringLen = 0;
		String bigString = "";

		boolean match = false;

		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {

			arr[i] = input.nextLine();
			if (arr[i].length() > bigStringLen) {
				bigStringLen = arr[i].length();
				bigString = arr[i];

			}
		}

		int len = bigStringLen;
		while (bigString.substring(0, len).length() > 0) {
			for (int i = 0; i < n; i++) {

				if (arr[i].contains(bigString.substring(0, len))) {
					match = true;
				} else {
					match = false;
					break;
				}
			}
			if (match) {
				System.out.println(bigString.substring(0, len));
				break;
			}

			len--;
		}

}
}
