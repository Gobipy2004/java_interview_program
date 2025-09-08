import java.util.Scanner;
class Bintodec
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter Number: ");
		int number=sc.nextInt();
		String res=isbinary(number);
		System.out.println(res);
	}
	public static String isbinary(int number)
	{
		String ans="";
		while (number>0)
		{
			ans=number%2+ans;
			number/=2;
		}
		return ans;
	}
}
