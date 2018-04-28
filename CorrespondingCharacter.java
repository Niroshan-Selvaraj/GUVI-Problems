public class CorrespondingCharacter{
public static void main(String args[]){
char ch = 0;
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (!(number < 1 && number > 26)) {
			ch = (char) (64 + number);
		}

		System.out.print(ch);
}

}
