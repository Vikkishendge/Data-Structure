package DSA;
import java.util.Scanner;
public class Stack_LL 
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
    Node top=null;
    public void push()
    {
    	System.out.println("Enter the data:");
    	int data=sc.nextInt();
    	Node newnode=new Node(data);
    	if(top==null)
    	{
    		top=newnode;
    	}else
    	{
    		newnode.next=top;
    		top=newnode;
    	}
    }
    public void pop()
    {
    	if(top==null)
    	{
    		System.out.println("Stack is empty");
    	}else
    	{
    		top=top.next;
    	}
    }
    public void display()
    {
    	Node temp=top;
    	System.out.print("TOP");
    	while(temp!=null)
    	{
    		System.out.print("-->"+temp.data);
    		temp=temp.next;
    	}
    }
	public static void main(String[] args) 
	{
		int ch=0;
		Stack_LL obj=new Stack_LL();
		do
		{
			
			System.out.println("\n1)PUSH \n 2) POP  \n 3)Display");
			System.out.println("Enter any op:");
			 ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				obj.push();
				break;
				
			case 2:
				obj.pop();
				break;
				
			case 3:
				obj.display();
				break;
			}
			
		}while(ch<=3);


	}

}
