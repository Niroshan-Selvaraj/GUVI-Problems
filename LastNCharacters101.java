public class LastNCharacters{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int N = input.nextInt();
		int index = str.length() - N;
		System.out.print(str.substring(index));


}


}
