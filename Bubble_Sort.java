package DSA;
import java.util.Scanner;
public class Bubble_Sort 
{
	public int  bubble(int arr[],int n)
	{
	   int temp;
	   for(int i=0;i<n-1;i++)
	   {
		   for(int j=0;j<n-i-1;j++)
		   {
			   if(arr[j]>arr[j+1])
			   {
				   temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }
		   }
	   }
	   return 0;
	}
	public static void main(String[] args)
	{
		
		Bubble_Sort obj=new Bubble_Sort();
		// number of pasess n-1
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the element:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		obj.bubble(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
