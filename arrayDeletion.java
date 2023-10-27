package DSA;
import java.util.Scanner;
public class arrayDeletion {

			public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array:");
			int n=sc.nextInt();
			
			int arr[]=new int[n];
			int arr1[]=new int[n-1];
			System.out.println("Enter the items:");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				
			}
			System.out.println("Enter the position:");
			int pos=sc.nextInt();
				
			for(int i=0;i<n;i++)
			{
				if(i<pos)
				{
					arr1[i]=arr[i];
				}else
					if(i==pos)
					{
						continue;
					}else
					{
						arr1[i]=arr[i];
					}
			}
			for(int i=0;i<n;i++)
			{
				System.out.println(arr1[i]);
			}

		}	

	

}
