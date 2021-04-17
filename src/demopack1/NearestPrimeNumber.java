package demopack1;

import java.util.Scanner;

public class NearestPrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int max1=0;
		
		for(int i=num;i<num*10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
			if(i%j==0)
			{
				count++;
			}
			
			}
			if(count==2)
			{
			max1=i;
			break;
			
			}
			count=0;
			
		}
		count=0;
		int max2=0;
		for(int i=num;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				
			if(i%j==0)
			{
				count++;
			}
			
			}
			if(count==2)
			{
			max2=i;
			break;
			
			}
			count=0;
			
		}
		
		int a=max1-num;
		int b=num-max2;
		if(a<b)
		{

		System.out.println(max1);
		}
		if(a==b)
		{
			System.out.println(max1+" "+max2);
		}
		else
			System.out.println(max2);
	}

}
