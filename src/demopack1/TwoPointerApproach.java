//Two pointer approach : to find the sum in a array it is not so better than hashing
package demopack1;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointerApproach
{
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
		int len=sc.nextInt();
	
		int arr[]=new int[len];
		

		
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int left=0;int right=len-1;
		while(left<right)
		{
			if(arr[left]+arr[right]==sum)
			{
				System.out.println(arr[left]+","+arr[right]);
				right--;
				
			}
			else if(arr[left]+arr[right]>sum)
			{
				right--;
			}
			else
				left++;
		}
		

	}

}
