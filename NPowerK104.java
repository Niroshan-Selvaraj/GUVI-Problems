public class NPowerK104{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
		int base = input.nextInt();
		int power = input.nextInt();
		int result = 1;
		for (int i = 0; i < power; i++)
			result = result * base;

		System.out.print(result);
}

}
