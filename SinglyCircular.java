package DSA;
import java.util.Scanner;

import DSA.Singly_linked_list.Node;
public class SinglyCircular 
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
   Node head=null,tail=null;
public void insertion()
{
	int n=0;
	do
	{
	int data;
	System.out.println("Enter the Node Data:");
	data=sc.nextInt();
	Node newnode=new Node(data);
	if(head==null)
	{
		head=newnode;
		tail=newnode;
		newnode.next=head;
	}else
	{
		
		
			int ch;
			System.out.println("1)Insert Beginning \n 2)Insert End \n 3)Insert Specific Position");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				newnode.next=head;
				head=newnode;
				tail.next=head;
				break;
				
			case 2:
				tail.next=newnode;
				tail=newnode;
				newnode.next=head;
				break;
				
			case 3:
				Node temp=head;
				System.out.println("Enter the position:");
				int pos=sc.nextInt();
				for(int i=0;i<(pos-1);i++)
				{
					temp=temp.next;
				}
				newnode.next=temp.next;
				temp.next=newnode;
				break;
			}

	}
	System.out.println("Do you want insert Node press:0");
	n=sc.nextInt();
}while(n==0);
}
public void traverse()
{
	Node temp=head;
	System.out.print("HEAD");
	do
	{
		System.out.print("---"+temp.data+"---");
		temp=temp.next;
	}while(temp!=head);
	System.out.print("TAIL");
}
public void deletion()
{
   int n=0;
	if(head==null)
	{
		System.out.println("Linked List not exits");
	}
		do
		{
			System.out.println("Enter the node to be delete:");
			System.out.println("1)Delete Beginning \n2)Deletion End \n 3)Deletion Specific Position");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				Node temp=head;
				temp=temp.next;
				head=temp;
				tail.next=head;
				break;
				
			case 2:
				Node temp1=head,temp2=temp1.next;
				while(temp2.next!=head)
				{
					temp1=temp2;
					temp2=temp2.next;
					
				}
				temp1.next=head;
				tail=temp1;
				break;
				
			case 3:
				Node temp3=head,temp4=temp3.next;int pos;
				System.out.println("Enter the pos:");
				pos=sc.nextInt();
				for(int i=1;i<(pos-1);i++)
				{
					temp3=temp4;
					temp4=temp4.next;
				}
				temp3.next=temp4.next;
				break;
			}
			System.out.println("Do you want Delete Node press:0");
			n=sc.nextInt();
		}while(n==0);	
}
public void Sorting()
{
	Node temp=head,temp1;
	int num;
	if(head==null)
	{
		System.out.println("linked list not exits");
	}
		while(temp.next!=head)
		{
			temp1=temp.next;
			while(temp1!=head)
			{
				if(temp.data>temp1.data)
				{
					num=temp.data;
					temp.data=temp1.data;
					temp1.data=num;
				}
				temp1=temp1.next;
			}
			temp=temp.next;
		}
		System.out.println("Sorted Linked List:");
		Node temp4=head;
		System.out.print("HEAD");
		do
		{
			System.out.print("---"+temp4.data+"---");
			temp4=temp4.next;
		}while(temp4!=head);
		System.out.print("TAIL");
	
}
public int Search(int search)
{
	Node temp=head;
	int c=0;
	if(head!=null)
	{
		for(temp.data=head.data;temp.data<=tail.data;temp=temp.next)
		{
			c++;
			if(temp.data==search)
			{
				return c;
			}
		}
		return -1;
	}
	return c;
}
	public static void main(String[] args) 
	{
		SinglyCircular obj=new SinglyCircular();
		do
		{
			System.out.println("\n\nLinked List Operation:");
			System.out.println("1)Creation/Insertion \n 2)Traverse \n3)Deletion \n4)Sorting \n5)Searching");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				obj.insertion();
			    break;
			    
			case 2:
				obj.traverse();
				break;
				
			case 3:
				obj.deletion();
				break;
				
			case 4:
				obj.Sorting();
				break;
			
			case 5:
				System.out.println("Enter the node to be search");
				int search=sc.nextInt();
				int n=obj.Search(search);
				if(n==-1)
				{
					System.out.println(search+"Not in Linked List");
				}else
				{
					System.out.println(search+"Find at Position:"+n);
				}
		}
		}while(true);

	}

}
