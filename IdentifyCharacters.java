import java.util.Scanner;
public class IdentifyCharacters {
	public static void identifyCharacter(char ch)
	{
		if(ch>='a' && ch<='z')
		{
			System.out.println("Lower case");
		}
		else if(ch>='A' &&ch<='Z')
		{
			System.out.println("Upper case");
		}
		else
		{
			System.out.println("Special case");
		}
		}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Value Character");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
		
	}
}
