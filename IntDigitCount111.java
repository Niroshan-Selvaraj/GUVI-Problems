public class IntDigitCount111{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int number = input.nextInt();
int count = 0;
while(number>0){
number = number/10;
count++;
}
System.out.print(count);
}


}
