package demopack1;
/*
 Input:
N = 4
X[] = 5,15,1,3
Output:
5
10
5
4
Explanation:Flow in stream : 5, 15, 1, 3 
5 goes to stream --> median 5 (5) 
15 goes to stream --> median 10 (5,15) 
1 goes to stream --> median 5 (5,15,1) 
3 goes to stream --> median 4 (5,15,1 3)
 */

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfSeries {
	public static void main (String[] args) {
	    {
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      for(int i=0;i<n;i++)
	      arr[i]=sc.nextInt();
	      for(int i=0;i<n;i++)
	      {
	          Arrays.sort(arr,0,i+1);
	          if(i%2!=0)
	          {
	              System.out.println(((arr[(i)/2]+arr[(i+1)/ 2]) / 2));
	          }
	          else
	          System.out.println(arr[i/2]);
	      }
	    }
	}
	
}
