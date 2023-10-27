package DSA;
import java.util.Scanner;
public class Circular_Queue
{
     static Scanner sc=new Scanner(System.in);
     int n=5;
     int f=-1,r=-1;
     int queue[]=new int[n];
     
     void enque()
     {
    	 System.out.println("Enter the Queue data");
 		int data=sc.nextInt();
    	 if(f==-1 && r==-1)
    	 {
    		f=0;
    		r=0;
    		queue[r]=data;
    	 }else
    		 if((r+1)%n==f)
    		 {
    			 System.out.println("Queue isFull");
    		 }
    		 else
    		 {
    			 r=(r+1)%n;
    			 queue[r]=data;
    		 }
    	 	
    		    	
     }
    
  void deque()
  {
	  if(f==-1 && r==-1)
	  {
		  System.out.println("Queue is Underflow");
	  }else
	  if(f==r)
	  {
		  r=f=-1;
	  }else
	  {
		  f=(f+1)%n;
		  
	  }
	    
	  
  }
  
  void display()
  {
	 int i=f;
	 while(i!=r)
	 {
		 System.out.print(queue[i]+"\t");
		 i=(i+1)%n;
	 }
  }
	public static void main(String[] args) 
	{
		int ch,n;
		Circular_Queue obj=new Circular_Queue();
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
