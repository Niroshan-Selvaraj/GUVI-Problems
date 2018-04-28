public class APSum108{
public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int d = input.nextInt();
		int n = input.nextInt();
		int result = (n / 2) * ((2 * a) + (n - 1) * d);
		System.out.print(result);

}
}
