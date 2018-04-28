public class LeapYearCheck{
public static void main(String args[]){

Scanner input = new Scanner(System.in);
 int year = input.nextInt();
 
 boolean belowHundredYearLeapCheck = year<100 && year%4==0;
 boolean aboveundredYearLeapCheck = (year%100==0 && year%400==0);
 
 if(belowHundredYearLeapCheck||aboveundredYearLeapCheck){
	 System.out.println("Yes");
 }else{
	 System.out.println("No");
 }

}

}
