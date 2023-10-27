package DSA;
import java.util.Arrays;
import java.util.Scanner;
public class Binary_Search
{
    public int binary(int arr[],int n,int search)
    {
    	int start=0,end=n-1,mid;
    	while(start<=end)
    	{
    		mid=(start+end)/2;
    		if(arr[mid]==search)
    			return mid;
    		
    		if(search>arr[mid])
    		{
    			start=mid+1;
    		}
    			else
    			{
    			end=mid-1;
    			}
    	}
    	return -1;
    }
	public static void main(String[] args) 
	{
		Binary_Search obj=new Binary_Search();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		//if array is not sorted appply any sorting algorithm or function
	     Arrays.sort(arr);
	     int search=sc.nextInt();
	     int res=obj.binary(arr,n,search);
		if(res==-1)
		{
			System.out.println("element not found");
		}else
		{
			System.out.println("element is found position"+res);
		}
	}

}
