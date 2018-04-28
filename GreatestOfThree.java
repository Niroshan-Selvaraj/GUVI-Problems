public class GreatestOfThree{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
 int number1 = input.nextInt();
 int number2 = input.nextInt();
 int number3 = input.nextInt();
 
int biggerNumber = number1;

if(number2>number3){
	if(number2>biggerNumber){
		biggerNumber = number2;
	}
}else{
	if(number3>biggerNumber)
		biggerNumber = number3;
}
 
System.out.println(biggerNumber);

}

}
