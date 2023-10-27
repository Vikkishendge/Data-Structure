package DSA;

public class LL_Mid_Calculate 
{
	public static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	Node head=null;
	
public void insert(int data)
{
	Node newnode=new Node(data);
	if(head==null)
	{
		head=newnode;
	}
	else
	{
		newnode.data=data;
		newnode.next=head;
		head=newnode;
	}
}
public void display()
{
	if(head==null)
	{
		System.out.println("No element");
	}else
	{
		Node temp = head;
	 	 while(temp!=null)
	 {
		 System.out.print(temp.data+" ");
		 temp=temp.next;
	 }
		
	}
}
public void midcalculate()
{
	Node temp=head;
	Node temp1=head;
	while(temp1.next!=null)
	{
		temp=temp.next;
		temp1=temp1.next.next;
	}
	System.out.println("Mid :"+temp.data);
}
	public static void main(String[] args) 
	{
		LL_Mid_Calculate obj=new LL_Mid_Calculate ();
		int data[]= {10,20,30,40,50,60,70};
		
		for(int i=0;i<data.length;i++)
		{
			obj.insert(data[i]);
		}
		obj.display();
		System.out.println("calculate mid");
        obj.midcalculate();
	}

}
