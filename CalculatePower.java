public class CalculatePower(){
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int base = Integer.parseInt(scan.nextLine());
int power = Integer.parseInt(scan.nextLine());
int total = 1;
int result = 0;
for(int i=1;i<=power;i++){
total = base*total;
}
result = base>0?total:base;
System.out.println(result);
}

}
