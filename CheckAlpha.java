public class CheckAlpha{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
char ch = input.nextLine().charAt(0);
if(ch>='a' && ch<='z'||ch>='A' && ch<='Z')
	System.out.println("The entered character is an Aplhabet");
else
	System.out.println("The entered character is not an Alphabet character");


}

}
