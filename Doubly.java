package DSA;
import java.util.Scanner;
public class Doubly 
{
	static Scanner sc=new Scanner(System.in);
	static class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		                 			
		}
	}
   Node head=null;Node tail=null;

   public void creation()
   {
	   Node newnode;
	   int data;
	   System.out.println("Enter the data:");
	    data=sc.nextInt();
	    newnode=new Node(data);
	   if(head==null)
	   {
		   head=newnode;
		   tail=newnode;
	   }
	   
   }
   public void insertion()
   {
	   int n=0;
	   do
	   {
		   Node newnode;
		   int data,ch;
	   System.out.println("Enter the node insert:");
	   data=sc.nextInt();
	   newnode=new Node(data);
	   System.out.println("1)Insert at Begining \n2)insert at End \n3)Insert at Specific Position");
	    ch=sc.nextInt();
	    switch(ch)
	    {
	    case 1:
	    	newnode.next=head;
	    	head.prev=newnode;
	    	head=newnode;
	    	break;
	    case 2:
	    	tail.next=newnode;
	    	newnode.prev=tail;
	    	tail=newnode;
	    	break;
	    case 3:
	    	System.out.println("Enter the position:");
	    	int pos=sc.nextInt();
	    	Node temp=head;
	    	Node temp1=temp.next;
	    	for(int i=1;i<(pos-1);i++)
	    	{
	    		temp=temp1;
	    		temp1=temp1.next;
	    	}
	    	newnode.prev=temp;
	    	newnode.next=temp1;
	    	temp.next=newnode;
	    	temp1.prev=newnode;
	    	break;
	    }
	    System.out.println("Do you have insert :press 0");
	    n=sc.nextInt();
	   }while(n==0);
   }
   public void traverse()
   {
	   Node temp=head;
	   System.out.print("HEAD");
	   while(temp!=null)
	   {
		   System.out.print("---"+temp.data+"----");
		   temp=temp.next;
	   }
	   System.out.print("TAIL");
   }
   public void deletion()
   {
	   int n=0;
	   do
	   {
		   if(head==null)
		   {
			   System.out.println("Linked doesn't Exits");
		   }else
		   {
			   System.out.println("Enter the node to be deleted");
			   System.out.println("1)Delete Beginning node \n2)Delete End node \n 3)Delete specific node");
			   int ch=sc.nextInt();
			   switch(ch)
			   {
			   case 1:
				   Node temp=head;
				   temp=temp.next;
				   head=temp;
				   head.prev=null;
				   break;
				   
			   case 2:
				   Node temp1=tail;
				   temp1=temp1.prev;
				   temp1.next=null;
				   tail=temp1;
				   break;
				   
			   case 3:
			   {
				   System.out.println("Enter the position you want delete node:");
				   int pos=sc.nextInt();
				   Node temp3=head,temp4=temp3.next;
				   for(int i=1;i<(pos-1);i++)
				   {
					   temp3=temp4;
					   temp4=temp4.next;
				   }
				   temp3.next=temp4.next;
				   temp4.next.prev=temp3;
				   break;
				   
				 
			   }
			   }
		   }
		   System.out.println("delete element press:0");
		   n=sc.nextInt();
	   }while(n==0);
   }
   public void Sorting()
   {
	   Node temp,temp1;
	   int data;
	   for(temp=head;temp!=null;temp=temp.next)
	   {
		   for(temp1=temp.next;temp1!=null;temp1=temp1.next)
		   {
			   if(temp.data>temp1.data)
			   {
				   data=temp.data;
				   temp.data=temp1.data;
				   temp1.data=data;
			   }
		   }
	   }
	   Node temp3=head;
	   System.out.print("HEAD");
	   while(temp3!=null)
	   {
		   System.out.print("---"+temp3.data+"---");
		   temp3=temp3.next;
	   }
	   System.out.print("TAIL\n");
   }
   public int  Searching(int search)
   {
	   Node temp;
	   int c=0;
	   for(temp=head;temp!=null;temp=temp.next)
	   {
		   c++;
		   if(temp.data==search)
		   {
			   return c;
		   }
	   }
	   return -1;
   }
   public void reverse()
   {
	   Node temp=tail;
	   System.out.print("TAIL");
	   while(temp!=null)
	   {
		   System.out.print("---"+temp.data+"---");
		   temp=temp.prev;
	   }
	   System.out.println("HEAD");
   }
	public static void main(String[] args) 
	{
		int ch;
		Doubly obj=new Doubly();
		obj.creation();
		do
		{
			System.out.println("\n\nEnter the Operation:");
			System.out.println("1)Insertion \n2)Traverse\n3)Deletion \n4)Soring \n5)Searching\n 6)Reverse");
			ch=sc.nextInt();
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
				   System.out.println("Enter the node to be search:");
				   int search=sc.nextInt();
				int data=obj.Searching(search);
				if(data==-1)
				{
					System.out.println(search+" not found at position");
				}else
				{
					System.out.println(search+":found at position:"+data);
				}
				break;
				
			case 6:
				System.out.println("Linked list Reverse order:\n");
				obj.reverse();
				break;
			}
			
		}while(ch<8);
        
	}

}
