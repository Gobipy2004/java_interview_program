import java.util.Scanner;
class Prime
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter Your Number: ");
		int number=sc.nextInt();
		boolean res=isPrime(number);
		if (res)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
	public static boolean isPrime(int number)
	{
		if (number==1||number==0)
		{
			return false;
		}
		for (int i=2;i<number ;i++ )
		{
			if (number%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
