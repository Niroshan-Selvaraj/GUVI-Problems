public class CalculatingPower{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int base = input.nextInt();
int power = input.nextInt();
int result = base;
for(int i=1;i<power;i++){
 result = result*base;
}
System.out.println(result);
}}
