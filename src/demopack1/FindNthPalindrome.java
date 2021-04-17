package demopack1;

import java.util.Scanner;

public class FindNthPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count1=0;
		
	
		if(num<10)
		{
			System.out.println(num-1);
		}
		else 
		{
			
			for(int i=11;i<Integer.MAX_VALUE;i++)
			{
				if((isPalindrome(i)==true))
				{
					count1++;
					
				}
				if(count1+10==num)
				{
					System.out.println(i);
					break;
				}
				
			}
				
		}
			
		
	}
	public static boolean isPalindrome(int i)
	{
		int count=0;
		String s1=Integer.toString(i);
		String s2="";
		int len=s1.length();
		
		for(int k=len-1;k>=0;k--)
		{
			s2=s2+s1.charAt(k);
			
			
			
		}
		if((s1.compareTo(s2))==0)
		{
			return true;
		}
		else
			return false;
		
	}

}
