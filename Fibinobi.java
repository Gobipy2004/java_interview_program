import java.util.Scanner;
class Fibinobi
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter Number: ");
		int number=sc.nextInt();
		fibiNobi(number);
	}
	public static void fibiNobi(int number)
	{
		int n1=0,n2=1,n3=0;
		for (int i=1;i<=number ;i++ )
		{
			
			System.out.print(n3+"\t");
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			
		}
		
		
	}
	
}
