public class DisplayArmstroninInterval{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int  start = scan.nextInt();
	int end = scan.nextInt();
	int n ;
	int digit = 0;
	int digitCube = 0;
	int sum = 0;
	int number;
	
	
	for(int i=start+1;i<end;i++){
	number =i;
	n = number;
	sum = 0;
	while(number>0){
		digitCube = 0;
		digit = number%10;
		digitCube = digit*digit*digit;
		sum +=digitCube;
		number = number/10;
	}

if(n==sum)
	System.out.print(i+" ");
	}

}

}
