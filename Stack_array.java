package DSA;
import java.util.Scanner;
public class Stack_array 
{
	int top=-1;
	int n=5;
	static Scanner sc=new Scanner(System.in);
	int stack[]= new int[n];
	
    public void push()
    {
    	
    	if(top==n-1)
    	{
    		System.out.println("Stack is Overflow");
    	}else
    	{
    		System.out.println("Enter the data:");
    		int data=sc.nextInt();
    		top=top+1;
    		stack[top]=data;
    		System.out.println("Insert Successfully");
    	}
    }
    public void pop()
    {
    	if(top==-1)
    	{
    		System.out.println("Stack is Underflow");
    	}else
    	{
    		top=top-1;
    		System.out.println("Delete successfully");
    	}
    }
    public void display()
    {
    	if(top==-1)
    	{
    		System.out.println("Stack is Empty");
    	}
    	for(int i=top;i>=0;i--)
    	{
    		System.out.println(stack[i]);
    	}
    }
    public void peek()
    {
    	if(top==-1)
    	{
    		System.out.println("Stack Underflow");
    	}else
    	{
    		System.out.println("Top Element is:");
    		System.out.println(stack[top]);
    	}
    }
	public static void main(String[] args) 
	{
		Stack_array obj=new Stack_array();
		System.out.println("Enter the size of stack:");
		int ch=0;
		
		do
		{
			System.out.println("1)PUSH \n 2) POP \n3)Peek \n 4)Display");
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
				
			case 4:
				obj.peek();
				break;
			}
			
		}while(ch<=4);

	}

}
