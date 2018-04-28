public class KthOddNumber114{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
	int N = input.nextInt();
	int K = input.nextInt();
	int count = 0;
	int arr[] = new int[N];

	for(int i=0;i<N;i++){
	arr[i] = input.nextInt();
	}

	for(int i=0;i<N;i++){
	if(!(arr[i]%2==0))
	count++;

	if(count==K){
	System.out.print(arr[i]);
	break;
	}}




}

}
