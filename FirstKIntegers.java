public class FirstKIntegers{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int sum = 0;
int N = input.nextInt();
int K = input.nextInt();
int arr[] = new int[N];

for(int i=0;i<N;i++){
arr[i] = input.nextInt();
}
for(int j=0;j<K;j++){
sum += arr[j];
}
System.out.println(sum);
}

}
