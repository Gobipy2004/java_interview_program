import java.util.Scanner;
class Primerange
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter number1: ");
		int number1=sc.nextInt();
		System.out.print("Enter number2: ");
		int number2=sc.nextInt();
		int sum=0;
		for (int i=number1;i<=number2 ;i++ )
		{
			
			if (isprime(i))
			{
				System.out.print(i+"\t");
				sum+=i;
			
				
			}
			
		}
		System.out.println("sum: "+sum);
		
	}
	public static boolean isprime(int number)
	{
		if (number<=1)
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
