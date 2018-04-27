public class EvenorAdd{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
	int number = input.nextInt();
 
 
  if(number>=1 && number<=100000){
if(number%2==0)
System.out.println("Even");
else
System.out.println("Odd");
}
  else{
  System.out.println("Invalid input");
  }
}
}
