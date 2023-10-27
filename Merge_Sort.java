package DSA;
import java.lang.reflect.Array;
import java.util.*;
public class Merge_Sort 
{
	int mid,low,high;
	public void Merge(int arr[],int low,int mid,int high)
	{
		int arr1[] = null;
		int arr2[]=null;
		int left=low;
		int right=mid+1;
		int j=0;
		for(int i=low;i<=mid;i++)
		{
			arr1[i]=arr[left];
		}
		for(int i=right;i<=high;i++)
		{
			arr2[i]=arr[right];
		}
		while(left<=mid && right<=high)
		{
			if(arr1[left]<=arr2[right])
			{
				arr1[j]=arr1[left];
				j++;
				left++;
			}else
			{
				arr1[j]=arr2[right];
				j++;
				right++;
			}
		}
		while(left<=mid)
		{
			arr1[j]=arr1[left];
			j++;
			left++;
		}
		while(right<=high)
		{
			arr1[j]=arr2[right];
			j++;right++;
		}
		for(int i=low;i<high;i++)
		{
			arr[i]=arr1[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	
	}
	
	public void Divide(int arr[],int low,int high)
	{
		if(low<high)
		{
			mid=(low+high)/2;
		
		Divide(arr,low,mid);
		Divide(arr,mid+1,high);
		Merge(arr,low,mid,high);
		}
	}

	public static void main(String[] args) 
	{
		Merge_Sort obj=new Merge_Sort();
		int arr[]= {20,10,50,30,40};
		int n=arr.length;
		obj.Divide(arr,0,n);

	}

}
