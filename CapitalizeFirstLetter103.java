public class CapitalizeFirstLetter103{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char ch;
		for (int i = 0; i < str.length(); i++) {

			if (i == 0 || str.charAt(i - 1) == ' ') {
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					ch = (char) (str.charAt(i) - 32);
					System.out.print(ch);
				} else {
					System.out.print(str.charAt(i));
				}
			} else {
				System.out.print(str.charAt(i));
			}

		}

}


}
