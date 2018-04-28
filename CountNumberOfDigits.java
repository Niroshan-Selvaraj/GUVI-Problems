public class CountNumberOfDigits.java{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int number = input.nextInt();
int count = 0;
while(number>0){
count++;
number = number/10;
}
System.out.println(count);
}
}
