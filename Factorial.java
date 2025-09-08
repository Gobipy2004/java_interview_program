import java.util.Scanner;
class Factorial
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter Your Number: ");
		int number=sc.nextInt();
		int res=isFactorial(number);
		System.out.println(res);
	}
	public static int isFactorial(int number)
	{
		int sum=1;
		for (int i=1;i<=number ;i++ )
		{
			sum*=i;
		}
		return sum;
	}
}
