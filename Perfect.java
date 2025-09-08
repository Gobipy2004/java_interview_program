import java.util.Scanner;
class Perfect
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter Your Number: ");
		int number=sc.nextInt();
		boolean res=isPerfect(number);
		if (res)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("Not Perfect");
		}
	}
	public static boolean isPerfect(int number)
	{
		int temp=number,sum=0;
		for (int i=1;i<=number/2 ;i++ )
		{
			if (number%i==0)
			{
				sum+=i;
			}
			
		}
		if (temp==sum)
			{
				return true;
			}
		return false;
	}
}
