////two pointer approach only works for the sorted array
package demopack1;

import java.util.Scanner;
import java.util.Arrays;


public class TwoPointerApproach1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
		int len=sc.nextInt();
	
		int arr[]=new int[len];
		

		
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}                                 
		Arrays.sort(arr); //This is o(nlogn)   
		int left=0;
		int right=len-1;
		while(left<right)
		{
			if(arr[left]+arr[right]==sum)
			{
				System.out.println(arr[left]+","+arr[right]);
				right--;
			}
			else if((arr[left]+arr[right])>sum)
				right--;
			else
				left++;
		}
		
		
	}

}
