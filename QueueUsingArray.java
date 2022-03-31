//code by : Yusuf Humayun
import java.util.*;
class Queue{
    int f=-1,r=-1;
    int n=10;
    int q[] = new int[n];
    
    void enqueue(Scanner sc)
    {
        if(r==n-1)
            System.out.println("Queue overflow");
        else
        {
            System.out.println("Enter the Data :");
            int ele= sc.nextInt();
            if( f == -1 && r == -1)
            {
                f=0;
                r=0;
                q[r]=ele;
            }
            else
            {
                q[++r]=ele;
            }
        }
    }
    void dequeue()
    {
        if( f==-1 && r == -1)
            System.out.println("Queue Undeflow");
        else
        {
            System.out.println("Deque data :"+q[f]+" | Dqueue operation is sucessful");
            f++;
        }
    }
    void display()
    {
        System.out.print("Queue Elements :");
        for(int i=f ; i <= r ; i++)
        {
            System.out.print(q[i]+" ");
        }
        
    }
}
puclic class QueueUsingArray {
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Queue q1 = new Queue();
        int next;
        do
        {
            System.out.println("===========Queue ===========\n");
            System.out.print("1. Enqueue Operation\n");
            System.out.print("2. Dqueue Operation \n");
            System.out.print("3. Display Queue : \n");
            System.out.print("\nEnter your Choice :");
            int choice=sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    q1.enqueue(sc);
                    break;
                case 2 :
                    q1.dequeue();
                    break;
                case 3:
                    q1.display();
                    break;
                default:
                    System.out.println("Invalid Operation! Try again");
                    
                
            }
            System.out.println("Do you want to Continue (Yes/No):\n Press 1 for Yes \n Press anykey for No");
             next=sc.nextInt();
        }while( next == 1);
        
        
        
    }
}
//code by : Yusuf Humayun
