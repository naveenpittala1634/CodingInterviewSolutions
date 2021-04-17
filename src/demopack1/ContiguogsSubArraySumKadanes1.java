package demopack1;

import java.util.Scanner;

public class ContiguogsSubArraySumKadanes1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int arr[]=new int[num];
	for(int i=0;i<num;i++)
	{
		arr[i]=sc.nextInt();
	}
	int max=Integer.MIN_VALUE,max1=0;
	for(int i=0;i<num;i++)
	{
		max1=max1+arr[i];
		if(max<max1)
		{
			max=max1;
		}
		if(max1<0)
		{
			max1=0;
		}
		
		
	}
	System.out.println(max);
	
}
}
