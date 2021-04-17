package demopack1;
import java.util.*;
class MergeSort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ms(arr,0,n-1);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");	
	}
	public static void ms(int arr[],int low,int high)
	{
		if(low==high)
			return;
		int mid=(low+high)/2;
		ms(arr,low,mid);
		ms(arr,mid+1,high);
		merge(arr,low,high,mid);
	}
	public static void merge(int arr[],int low,int high,int mid)
	{
       int temp[]=new int[high-low+1];
	   int p1=low,p2=mid+1,k=0;
	   while(p1<=mid && p2<=high)
		{
		   if(arr[p1]<arr[p2])
			   temp[k++]=arr[p1++];
		   else
			   temp[k++]=arr[p2++];
		}
		while(p1<=mid)
		{
			temp[k++]=arr[p1++];
		}
        while(p2<=high)
		{
			temp[k++]=arr[p2++];
		}
		for(int i=low;i<=high;i++)
			arr[i]=temp[i-low];
	}
}