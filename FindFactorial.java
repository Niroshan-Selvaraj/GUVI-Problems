public class FindFactorial{
public static void main(String args[]){

Scanner scan = new Scanner(System.in);
	int number = scan.nextInt();
	int result = 1;
	for(int i=1;i<=number;i++){
		result = result*i; 
	}
	System.out.print(result);
}}
