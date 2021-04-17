package demopack1;

import java.util.Scanner;

public class MaxSubArraySum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=sc.nextInt();
	int num=sc.nextInt();
	int arr[]=new int[num];
	for(int i=0;i<num;i++)
	{
		arr[i]=sc.nextInt();
	}
	int curr=0;
	int res=arr[0];
	for(int i=0;i<num;i++)
	{
		for(int j=i+1;j<num ;j++)
		{
			if(arr[i]+arr[j]<=sum)
			{
			curr=arr[i]+arr[j];
		
			res=Math.min(res, curr);	
			}
		}
		curr=0;
	}
	int count=0;
	for(int i=0;i<num;i++)
	{
		for(int j=i+1;j<num;j++)
		{
			if(arr[i]+arr[j]==res)
			{
				System.out.println(arr[i]*arr[j]);
				count++;
				break;
				
			}
		}
		if(count==1)break;
	}
}
}
