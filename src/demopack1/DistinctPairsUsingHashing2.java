package demopack1;

import java.util.Scanner;
import java.util.HashMap;

public class DistinctPairsUsingHashing2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
		for(int i=0;i<len;i++)
		{
			int value=arr[i];
			int c=sum-arr[i];
			if(hm.containsKey(c))
			{
				if(hm1.containsKey(value)==false)
				{
					hm1.put(value, c);
					System.out.println(value+","+c);
					
				}
			}
			else if(hm.containsKey(value)==false)
			{
				hm.put(value, 1);
			}
		}
	}

}
