package demopack1;

import java.util.Scanner;

public class SievePrimes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int[] primes=new int[range+1];
		
		for(int i=1;i<range;i++)
		{
			primes[i]=1;
		}
		primes[0]=0;
		primes[1]=0;
		
		for(int i=2;i<=Math.ceil(Math.sqrt(range));i++)
		
		{
			for(int j=2;j*i<=range;j++)
			{
				if(primes[j*i]==1)
				{
					primes[j*i]=0;
				}
			}
			
			
		}
		for(int i=0;i<range;i++)
		{
			if(primes[i]==1)
			{
				System.out.println(i);
			}
		}
	}

}
