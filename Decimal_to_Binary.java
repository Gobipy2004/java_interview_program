import java.util.Scanner;
class dectobin
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter Number: ");
		int number=sc.nextInt();
		int res=isdecimal(number);
		System.out.println(res);
	}
	public static int isdecimal(int number)
	{
		int sum=0,x=1;
		while (number>0)
		{
			sum+=(number%10)*x;
			x*=2;
			number/=10;
		}
		return sum;
	}
}
