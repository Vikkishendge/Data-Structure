class MergeSort
{
	public static void conqure(int arr[],int start,int mid,int end)
	{
		// conqure
		int merge[]=new int[end-start+1];
		int indx1=start;
		int indx2=mid+1;
		int i=0;
		while(indx1<=mid && indx2<=end)
		{
			if(arr[indx1]<=arr[indx2])
			{
				merge[i++]=arr[indx1++];
			}else
			{
				merge[i++]=arr[indx2++];
			}
		}
		while(indx1<=mid)
		{
			merge[i++]=arr[indx1++];
		}
		while(indx2<=end)
		{
			merge[i++]=arr[indx2++];
		}

		for(int j=0,k=start;j<merge.length;j++,k++)
		{
			arr[k]=merge[j];
		}
	}
	public static void divide(int arr[],int start,int end)
	{
		if(start>=end)
		{
			return;	
		}
		int mid=start +(end-start)/2;
		divide(arr,start,mid);

		divide(arr,mid+1,end);

		conqure(arr,start,mid,end);
	}
	public static void main(String args[])
	{
		int arr[]={3,5,1,6,2,4};
		int n=arr.length;

		divide(arr,0,n-1);

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
