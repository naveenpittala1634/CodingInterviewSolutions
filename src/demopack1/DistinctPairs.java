package demopack1;

import java.util.Scanner;
import java.util.*;

public class DistinctPairs {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=sc.nextInt();
	int len=sc.nextInt();
	int arr[]=new int[len];
	LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();

	
	for(int i=0;i<len;i++)
	{
		arr[i]=sc.nextInt();//elements are stored here in the array
	}
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(arr[i]+arr[j]==sum)
			{
				if(hm.containsKey(arr[i])==false&&hm.containsKey(arr[j])==false)
						{
				hm.put(arr[i],arr[j]);
				System.out.println(arr[i]+","+arr[j]);
						}
                				
				                                
				
			}
		}
	}
	
	
	
}
}
