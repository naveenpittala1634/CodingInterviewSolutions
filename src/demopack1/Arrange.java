/* 0,1,0,2,2,1
   0,0,1,1,2,2
 */
package demopack1;
import java.util.*;
public class Arrange {
	
		public static void main (String[] args) {
			Scanner sc=new Scanner(System.in);
			    int n=sc.nextInt();
			    int arr[]=new int[n];   
			    for(int i=0;i<n;i++)
			    arr[i]=sc.nextInt();
			    segregate(arr,n);
			    for(int i=0;i<n;i++)
			    System.out.print(arr[i]+" ");
		}
		public static void segregate(int a[],int n){
		    int l=0,mid=0,high=n-1;
		    while(mid<=high){
		        if(a[mid]==0){
		            int temp=a[l];
		            a[l]=a[mid];
		            a[mid]=temp;
		            l++;
		            mid++;
		        }
		        else if(a[mid]==1)
		        mid++;
		        else{
		            int temp=a[high];
		            a[high]=a[mid];
		            a[mid]=temp;
		            high--;
		        }
		    }
		}

}
