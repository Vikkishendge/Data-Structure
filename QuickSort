class QuickSort
{
	public static int partition(int arr[],int low,int high)
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
			while(arr[j] > pivot && j>=low+1)
			{
				j--;
			}
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}
	public static void quicksort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int pindex=partition(arr,low,high);
		
			quicksort(arr,low,pindex-1);
			
		    quicksort(arr,pindex+1,high);
		}
	}
	public static void main(String args[])
	{
		int arr[]={3,5,1,8,6,2,7};
		int len=arr.length-1;

		quicksort(arr,0,len);
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}	
	}
}
