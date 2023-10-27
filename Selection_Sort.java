package DSA;
import java.util.Scanner;
public class Selection_Sort 
{
    static int selection(int arr[],int n)
    {
    	int loc,temp;
    	for(int i=0;i<n-1;i++)
    	{
    		loc=i;
    		for(int j=i+1;j<n;j++)
    		{
    			if(arr[j]<arr[loc])
    			{
    				loc=j;
    			}
    			temp=arr[i];
    			arr[i]=arr[loc];
    			arr[loc]=temp;
    		}
    	}
		return 0;
    	
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Selection_Sort obj=new Selection_Sort();
		System.out.println("Enter the number:");
		int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
		selection(arr,n);
		System.out.println("Sorted array");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
