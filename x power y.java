import java.util.Scanner;
class xpowery
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter x: ");
		int x=sc.nextInt();
		System.out.print("Enter y: ");
		int y=sc.nextInt();
		int res=power(x,y);
		System.out.println("x Power of y: "+res);
	}
	public static int power(int x,int y)
	{
		int res=1;
		for (int i=1;i<=y ;i++ )
		{
			res*=x;
		}
		return res;
	}
}
