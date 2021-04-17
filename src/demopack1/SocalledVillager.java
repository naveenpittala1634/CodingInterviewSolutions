package demopack1;
import java.util.Scanner;

public class SocalledVillager {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num*2];
		int max=0;
		for(int i=0;i<num*2-1;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<num*2-2;i++)
		{
			max=Math.max(max,arr[i+2]-arr[i]);
			
		}
		for(int i=0;i<num*2-2;i++)
		{
			if((arr[i+2]-arr[i])==max)
			{
				System.out.println(arr[i+3]+" "+arr[i+1]);
				
			}
		}
		
		}

}
