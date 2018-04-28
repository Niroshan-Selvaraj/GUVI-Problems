public class CheckArmstrong{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
	int  number = scan.nextInt();
	int n = number;
	int digit = 0;
	int digitCube = 0;
	int sum = 0;
	
	while(number>0){
		digitCube = 0;
		digit = number%10;
		digitCube = digit*digit*digit;
		sum +=digitCube;
		number = number/10;
	}

if(n==sum)
	System.out.println("Yes");

}

}
