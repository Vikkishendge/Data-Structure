class SelectionSort
{
	public static void selectionSort(int arr[],int len)
	{
		int temp,min;
		for(int i=0;i<len-1;i++)
		{
			min=i;
			for(int j=i+1;j<len;j++)
			{
				if(arr[j]<arr[min])
				{
			    		min=j;
					 
				}
				
			}
			temp=arr[i];
     		arr[i]=arr[min];
	        arr[min]=temp;
			
		}
	}
	public static void main(String args[])
	{
		int arr[]={60,20,10,30,40,50};
		int len=arr.length;

		selectionSort(arr,len);

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
