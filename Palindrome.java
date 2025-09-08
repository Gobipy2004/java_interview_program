import java.util.Scanner;
class Palindrome
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter Your Number: ");
		int number=sc.nextInt();
		boolean pali=ispalinDrome(number);
		if (ispalinDrome(number))
		{
			System.out.println(pali+" it is Palindrome");
		}
		else
		{
			System.out.println(pali+" it is not-Palindrome");
		}
	}
	public static boolean ispalinDrome(int number)
	{
		int temp=number,res=0;
		while (number>0)
		{
			 res=(res*10)+(number%10);
			number/=10;
		}
		if (temp==res)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
