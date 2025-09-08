import java.util.Scanner;
class Factors
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("Enter Your Number: ");
		int number = sc.nextInt();
		facTors(number);
	
	}
	public static void facTors(int number)
	{
		for (int i=1;i<=number/2 ;i++ )
		{
			if (number%i==0)
			{
				System.out.print(i+"\t");
			}
		}
	}
}
