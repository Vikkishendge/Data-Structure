package DSA;
import java.util.Scanner;
public class Insertion_Sort 
{
     static int insertion(int arr[],int n)
     {
    	 int temp,j;
    	 for(int i=1;i<=n-1;i++)
    	 {
    		 temp=arr[i];
    		 j=i-1;
    		 while(temp<arr[j] && j>-1)
    		 {
    			 arr[j+1]=arr[j];
    			 j=j-1;
    		 }
    		 arr[j+1]=temp;
    	 }
    	 return 0;
     }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		insertion(arr,n);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
