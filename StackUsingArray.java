// Code by : Yusuf Huamyun
import java.util.*;
class Stack{
    int top=-1;
    int n=10;
    int s[] = new int[n];
    
    void push(Scanner sc)
    {
        if(top == n-1)
            System.out.println("Stack overflow ");
        else
        {
            System.out.println("Enter the Data :");
            int ele= sc.nextInt();
            
            s[++top] = ele ;
        }
    }
    void pop()
    {
        if( top == -1)
            System.out.println("Stack Underflow");
        else
        {
            System.out.println("Pop data :"+s[top]+" | Dqueue operation is sucessful");
            top--;
        }
    }
    void display()
    {
        System.out.print("Stack Elements :");
        for(int i=0 ; i <= top ; i++)
        {
            System.out.print(s[i]+" ");
        }
        
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s1 = new Stack();
        int next;
        do
        {
            System.out.println("===========Stack ===========\n");
            System.out.print("1. Push Operation\n");
            System.out.print("2. Pop Operation \n");
            System.out.print("3. Display Stack : \n");
            System.out.print("\nEnter your Choice :");
            int choice=sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    s1.push(sc);
                    break;
                case 2 :
                    s1.pop();
                    break;
                case 3:
                    s1.display();
                    break;
                default:
                    System.out.println("Invalid Operation! Try again");
                    
                
            }
            System.out.println("\n Do you want to Continue (Yes/No):\n Press 1 for Yes \n Press anykey for No");
             next=sc.nextInt();
        }while( next == 1);
        
        
        
    }
}
