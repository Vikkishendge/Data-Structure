package DSA;
import java.util.Scanner;
public class LinearSearch
{
	public int linear(int arr[],int n,int find)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==find)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		LinearSearch obj=new LinearSearch();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();  // size 
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		int find=sc.nextInt();
		int res=obj.linear(arr,n,find);
		if(res==-1)
		{
			System.out.println("item not found ");
		}else
		{
			System.out.println(find+"item is found position"+res);
		}
	}

}
