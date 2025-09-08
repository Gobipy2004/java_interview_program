import java.util.Scanner;
class Firstlastsum
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter Number: ");
		int number=sc.nextInt();
		int res=sum(number);
		System.out.println(res);
	}
	public static int sum(int number)
	{
		int last=number%10;
		while (number>9)
		{
			number/=10;
		}
		return last+number;
	}
}
