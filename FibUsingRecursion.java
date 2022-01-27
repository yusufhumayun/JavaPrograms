import java.util.Scanner;
class FibUsingRecursion
{
	static int n1=0,n2=1,temp=0;
	static void fibonacci(int count)
	{
		if(count>0)
		{	
			temp=n1+n2;
			System.out.print(" "+temp);
			n1=n2;
			n2=temp;
			fibonacci(count-1);
		}
	}
	public static void main(String []args)
	{
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int count=sc.nextInt();
		System.out.print(n1+" "+n2);
		fibonacci(count-2);
	}
}