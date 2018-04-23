/*import java.lang.*;
import java.util.*;*/

public class CheckNumber{
public static void main(String args[]){
Scanner scan  = new Scanner(System.in);
	int num = Integer.parseInt(scan.nextLine());
	String result = num>0?"Positive":num==0?"Zero":"Negative";
	System.out.println(result);
}
}
