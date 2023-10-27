package DSA;
import java.util.Scanner;
public class Queue_Array 
{
     static Scanner sc=new Scanner(System.in);
     int n=5;
     int f=-1,r=-1;
     int queue[]=new int[n];
     
     void enque()
     {
    	 
    	if(r==(n-1))
    	{
    		System.out.println("Queue is Overflow");
    	}else
    	{
    		System.out.println("Enter the Queue data");
    		int data=sc.nextInt();
    		if(f==-1 && r==-1)
    		{
    			f=0;r=0;
    			queue[r]=data;
    		}else
    		{
    			r=r+1;
    			queue[r]=data;
    		}
    	}
     }
    
  void deque()
  {
	  if(f==-1 && r==-1)
	  {
		  System.out.println("Queue is Underflow");
	  }else
	    
	  {
		  f=f+1;
	  }
  }
  
  void display()
  {
	 
		  for(int i=f;i<=r;i++)
		  {
			  
			  System.out.print(queue[i]+"\t");
			  
		  }
  }
	public static void main(String[] args) 
	{
		int ch,n;
		Queue_Array obj=new Queue_Array();
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
