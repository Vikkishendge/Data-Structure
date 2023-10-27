package DSA;

public class Quick_Sort 
{
	public int Partition(int arr[],int low,int high)
	{
		int pivot=arr[low];
		int i=low;
		int j=high;
		while(i<j)
		{
		while(arr[i]<=pivot && i<=high-1)
		{
			i++;
		}
		while(arr[j]>pivot && j<=low+1)
		{
			j--;
		}
		if(i<j)
		{
			int temp;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
		int temp;
		temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
		
	}
	int partition;
	public void quicksort(int arr[],int low,int high)
	{
		if(low<high)
		{
			partition=Partition(arr,low,high);
			Partition(arr,low,partition-1);
			Partition(arr,partition+1,high);
		}
		
		
	}

	public static void main(String[] args) 
	{
		Quick_Sort obj=new Quick_Sort();
		int arr[]= {10,3,2,8,4};
		int n=arr.length-1;
		obj.quicksort(arr,0,n);
		for(int i=0;i<arr.length-1;i++)
		{
		System.out.println(arr[i]);
		}
	}

}
