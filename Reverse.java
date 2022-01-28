import java.util.Scanner;
public class Reverse
{

	public static void main(String []args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int result = reverseNumber(n);
		System.out.println("Reverse of Number:"+result);
	}

	public static int reverseNumber(int x) 
	{
       		int m= x,reverse=0,rem;
        	while(m>0)
        	{
            		rem=m%10;
            		reverse= reverse*10 + rem;
            		m=m/10;
       		}
        	return reverse;
   	}

}
