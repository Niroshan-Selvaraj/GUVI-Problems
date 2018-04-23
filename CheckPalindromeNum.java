public class CheckPalindromeNum{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int n = Integer.parseInt(input.nextLine());
int number = n;
int resultSum = 0;
int digit = 0;
if(number<10001){
while(number>0){
digit = number%10;
number = number/10;
resultSum = (resultSum*10)+digit;
}
if(resultSum == n )
System.out.println("Given number is palindrome");
else
System.out.println("Not a palindrome number");
}
else{
System.out.println("Invalid number");

}
}
}
