public class DisplayPrimeInIntervals{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
	boolean isPrime;
	int start = scan.nextInt();
	int end = scan.nextInt();
	
	for(int i=start+1;i<end;i++){
		isPrime = true;
		for(int j=2;j<i;j++){
			if(i%j==0)
				isPrime = false;
		}
	if(isPrime)
	System.out.print(i+" ");

	}

}

}
