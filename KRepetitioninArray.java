public class KRepetitioninArray{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int count = 0;
int N = input.nextInt();
int K = input.nextInt();
int arr[] = new int[N];

for(int i=0;i<N;i++){
arr[i] = input.nextInt();
}

for(int i=0;i<N;i++){
if(arr[i]==K)
count++;
}
System.out.print(count);
}

}
