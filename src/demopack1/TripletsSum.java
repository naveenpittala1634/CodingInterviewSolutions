package demopack1;

import java.util.Scanner;

public class TripletsSum
 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			
			arr[i]=sc.nextInt();
			
		}
		int sum=sc.nextInt();
		for(int i=0;i<len;i++)
		{
			
			for(int j=i+1;j<len;j++)
			{
				for(int k=j+1;k<len;k++)
				{
					if(arr[i]+arr[j]+arr[k]==sum)
					{
						System.out.println(i+" "+j+" "+k);
					}
				}
			}
			
		}
		
	}

}
