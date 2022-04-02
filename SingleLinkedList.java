import java.util.Scanner;
class LinkedList
{
    static class Node
    {
        int data;
        Node next;
    
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head = null ;
    
    public void creation()
    {
        int data,n;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Enter the Data :");
            data=sc.nextInt();
            //Insertion at begin
            Node new_node= new Node(data);
            
            if(head == null)
                head= new_node;
            else
            {
                System.out.println("*****Enter Your Choice****\n1. Insert at Begin \n2. Insert at end\n3. Insert at Position");
                int choice=sc.nextInt();
                
                switch(choice)
                {
                    case 1:
                        new_node.next = head ;
                        head = new_node;
                        break;
                    case 2:
                        Node temp = head ;
                        
                        while(temp.next != null)
                        {
                            temp = temp.next;
                        }
                        temp.next=new_node ;
                        
                        break;
                    case 3 :
                        Node temp1 = head;
                        System.out.println("Enter the Position");
                        int pos=sc.nextInt();
                        
                        for(int i=1 ; i < pos-1 ; i++)
                            temp1=temp1.next;
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                    default:
                        System.out.println("Invalid Option ! Try Again");
                }
                
            }
            
            
           System.out.println("Do you want to continue \n Press 1 for Yes: \n Press Anykey for No:\n "); 
           n=sc.nextInt();
        }while(n==1);
    }
	public void deletion()
    {
        int data,n;
        Scanner sc= new Scanner(System.in);
        do{
            
            if(head == null)
                System.out.println("LinkedList is Empty :");
            else
            {
                System.out.println("*****Press****\n1. Delete at Begin \n2. Delete at end\n3. Delete at Position");
                int choice=sc.nextInt();
               // Node temp= head ;
                switch(choice)
                {
                    case 1:
                        Node temp= head;
						head = temp.next ;
                        break;
                    case 2:
                        Node temp1 = head ;
                        Node ptr = temp1.next ;
						
                        while(ptr.next != null)
                        {
							temp1=ptr ;
                            ptr = ptr.next;
                        }
                        temp1.next=null ;
                        
                        break;
                    case 3 :
                        Node temp2 = head;
						Node ptr1 = temp2.next ;
                        System.out.println("Enter the Position");
                        int pos=sc.nextInt();
                        
                        for(int i=1 ; i < pos-1 ; i++)
                        { 
							temp2 = ptr1 ;
							ptr1=ptr1.next;
						}
                        temp2.next = ptr1.next ;
                        break;
                    default:
                        System.out.println("Invalid Option ! Try Again");
                }
                
            }
            
            
           System.out.println("Do you want to continue \n Press 1 for Yes: \n Press Anykey for No:\n "); 
           n=sc.nextInt();
        }while(n==1);
    }
    
    //Traverse The linked List
    public void displayList()
    {
        Node temp = head;
        
        if(head == null)
            System.out.println("Linked List is Empty");
        else
        {
            System.out.println("Linked List Elments Are :");
            while( temp !=null)
            {
                System.out.print(temp.data+"-->");
                temp = temp.next;
            }
        }
    }
    //
}

public class SingleLinkedList {
    public static void main(String[] args) {
        
        LinkedList l1 = new LinkedList();
        l1.creation();
        l1.displayList();
        l1.deletion();
        
    }
}
