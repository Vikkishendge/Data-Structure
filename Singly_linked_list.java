 package DSA;
import java.util.Scanner;

public class Singly_linked_list
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
	
	public void insert()
	{
		int n,choice=0;
		do
		{
			
		System.out.println("Enter the data:");
		int data=sc.nextInt();
		Node newnode=new Node(data);
	   		System.out.println("Enter the position :");
	   		System.out.println("1)Enter the node at Begining \n2)Enter the node at End \n3)Enter the data at Specific Position");
	   	    choice=sc.nextInt();
	   		switch(choice)
	   	    {
	   		case 1:
	   			newnode.next=head;
	   			head=newnode;
	   			break;
	   			
	   		case 2:
	   			Node temp=head;
	   			while(temp.next!=null)
	   			{
	   				temp=temp.next;
	   			}
	   			temp.next=newnode;
	   			break;
	   			
	   		case 3:
	   			System.out.println("Enter the position:");
	   			int p=sc.nextInt();
	   			Node temp1=head;
	   			for(int i=0;i<p-1;i++)
	   			{
	   				temp1=temp1.next;
	   			}
	   			newnode.next=temp1.next;
	   			temp1.next=newnode;
	   	    }
	   	System.out.println("Do you want create next node:Yes press :0");
	   	n=sc.nextInt();
		}while(n==0);
	}
	Node head=null;
	public void create()
	{
		int n;
		
		System.out.println("Enter the data:");
		int data=sc.nextInt();
		Node newnode=new Node(data);
	   	if(head==null)
	   	{
	   		head=newnode;
	   	}	}
	public void traverse()
	{
		Node temp=head;
		System.out.print("HEAD-->");
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("NULL\n\n");
	}
	public void deletion()
	{
		int n;
		do
		{
			int choice=0;
			Node temp,temp1;
	   		System.out.println("Enter the position node to be deleted:");
	   		System.out.println("1)Delete Begining node \n2)Delete End node \n3) Delete Specific Position node");
	   	    choice=sc.nextInt();
	   		switch(choice)
	   	    {
	   		case 1:
	   			 temp=head;
	   			 temp=temp.next;
	   			 head=temp;
	   			break;
	   			
	   		case 2:
	   		    temp=head; 
	   		    temp1=temp.next;
	   		    while(temp1.next!=null)
	   		    {
	   		    	temp=temp1;
	   		    	temp1=temp1.next;
	   		    }
	   		    temp.next=null;
	   			break;
	   			
	   		case 3:
	   			System.out.println("Enter the position:");
	   			int p=sc.nextInt();
	   			temp=head;
	   			temp1=temp.next;
	   			for(int i=0;i<(p-2);i++)
	   			{
	   				temp=temp1;
	   				temp1=temp1.next;
	   			}
	   			temp.next=temp1.next;
	   			break;
	   	    }
	   	System.out.println("Do you want Delete Node:press :0");
	   	n=sc.nextInt();
		}while(n==0);
	}
	public void Sorting()
	{
		Node temp,temp1;
		int num;
		for(temp=head;temp!=null;temp=temp.next)
		{
			for(temp1=temp.next;temp1!=null;temp1=temp1.next)
			{
				if(temp.data>temp1.data)
				{
					num=temp.data;
					temp.data=temp1.data;
					temp1.data=num;
				}
			}
		}
//		int c=0;
//		if(head!=null) {
//		Node temp;
//		temp=head;
//		while(temp!=null)
//		{
//			temp=temp.next;
//			c++;
//		}
//		
//	}
//		System.out.println("No of Nodes:"+c);
//		System.out.println("Sorted LinkedList");
//		
//		for(int i=0;i<c;i++)
//		{
//			for(int j=0;j<c-i-1;j++)
//			{
//				Node temp=head;
//				Node temp1=temp.next;
//				int temp3;
//				if(temp.data>temp1.data)
//				{
//					temp3=temp.data;
//					temp.data=temp1.data;
//					temp1.data=temp3;
//					
//				}
//				temp=temp1;
//				temp1=temp1.next;
//			}
//		}
		Node temp5=head;
		System.out.print("HEAD-->");
		while(temp5!=null)
		{
			System.out.print(temp5.data+"-->");
			temp5=temp5.next;
		}
		System.out.println("NULL\n\n");
	}
	public void Search()
	{
       Node temp;
       int i=0;
      System.out.println("Enter the node to be search:");
      int search=sc.nextInt();
      for(temp=head;temp!=null;temp=temp.next)
      {
    	  i++;
    	  if(temp.data==search)
    	  {
    		  System.out.println(search+" Is Found at position"+i);
    	  }
      }
     
	}
	public static void main(String[] args) 
	{
		int ch=0;
		Singly_linked_list obj=new Singly_linked_list();
		obj.create();
		do
		{
			System.out.println("Enter the node operations:");
			System.out.println("1)Insertion \n2)Traverse \n3)Deletion \n4)Sorting");
			 ch=sc.nextInt();
			 switch(ch)
			 {
			 case 1:
				 obj.insert();
				 break;
				 
			 case 2:
				 obj.traverse();
				 break;
				 
			 case 3:
				 obj.deletion();
				 break;
				 
			 case 4:
				 obj.Sorting();
				 
			 case 5:
				 obj.Search();
			 }
		}while(ch<4);
		
		
		
	}

}
