public class DivideRecursive102{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number % 2 == 0) {
			while (number > 0 && number % 2 == 0) {
				number = number / 2;
				System.out.println(number);
			}
		} else {
			System.out.println(number);
		}

}

}
