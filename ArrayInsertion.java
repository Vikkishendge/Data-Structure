package DSA;
import java.util.Scanner;
public class ArrayInsertion 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int arr1[]=new int[n+1];
		System.out.println("Enter the items:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the position:");
		int pos=sc.nextInt();
		System.out.println("Enter the value you want to insert:");
		int value=sc.nextInt();
		
		for(int i=0;i<n+1;i++)
		{
			if(i<pos-1)
			{
				arr1[i]=arr[i];
			}else
				if(i==pos-1)
				{
					arr1[i]=value;
				}else
				{
					arr1[i]=arr[i-1];
				}
		}
		for(int i=0;i<n+1;i++)
		{
			System.out.println(arr1[i]);
		}

	}

}
