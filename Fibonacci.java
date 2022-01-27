import java.util.Scanner;
class Fibonacci
{
	public static void main(String []args)
	{
		int n1=0,n2=1,temp;
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int count=sc.nextInt();
		
		System.out.print(n1+" "+n2);
		for(int i=2 ; i<count ; i++)
		{
			temp=n1+n2;
			System.out.print(" "+temp);
			n1=n2;
			n2=temp;		
		}
	}
}