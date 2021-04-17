package demopack1;

import java.util.Scanner;

public class LeadersOFTheArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max_array=arr[num-1];
		System.out.print(max_array);
		for(int i=num-2;i>=0;i--)
		{
			if(max_array<=arr[i])
			{
				max_array=arr[i];
				System.out.println(arr[i]+" ");
			}
		}
	}

}
