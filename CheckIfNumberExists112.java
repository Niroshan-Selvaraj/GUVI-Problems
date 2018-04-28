public class CheckIfNumberExists112{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
	int arr_limit = scan.nextInt();
	int search_number = scan.nextInt();
	int arr[] = new int[arr_limit];
	boolean isNumberExists = false;
  for(int i=0;i<arr_limit;i++){
	arr[i] = scan.nextInt();
	}
	
  for(int i=0;i<arr_limit;i++){
	  if(arr[i]==search_number){
  	   isNumberExists = true;
  	    break;
	}
	}
if(isNumberExists)
 System.out.print("yes");
else
 System.out.print("no");
	
}

}
