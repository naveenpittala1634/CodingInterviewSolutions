package demopack1;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		// 3 2 1
		
		for(int i=0;i<num;i++)
		{
			
			int index=i; 
			for(int j=i+1;j<num;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j; 
				
				}
			}
			int temp=arr[index]; 
			arr[index]=arr[i]; 
			arr[i]=temp; 
			
		    
		  
			
		}
		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
