package DSA;
import java.util.Scanner;
public class Queue_LL 
{
	static Scanner sc=new Scanner(System.in);
    static class Node
    {
    	int data;
    	Node next;
    	
    	Node(int data)
    	{
    		this.data=data;
    		this.next=null;
    	}
    }
    Node f=null,r=null;
    
    public void enque()
    {
    	System.out.println("Enter the data:");
    	int data=sc.nextInt();
    	Node newnode =new Node(data);
    	if(f==null && r==null)
    	{
    		f=newnode;
    		r=newnode;
    	}else
    	{
    		r.next=newnode;
    		r=newnode;
    	}
    }
    
    public void deque()
    {
    	if(f==null)
    	{
    		System.out.println("Queue is Empty");
    		
    	}else
    	{
    		f=f.next;
    	}
    }
    
    public void display()
    {
    	Node temp=f;
    	System.out.print("Front--");
    	while(temp!=null)
    	{
    		System.out.print(temp.data+"---");
    		temp=temp.next;
    	}
    	System.out.print("Rear");
    }
	public static void main(String[] args) 
	{
		int ch,n;
		Queue_LL obj=new Queue_LL();
		do
		{
			System.out.println("\n1)Enque \n2)Deque \n3)Display");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				obj.enque();
				break;
				
			case 2:
				obj.deque();
				break;
				
			case 3:
				obj.display();
				break;
			}
		}while(true);



	}

}
