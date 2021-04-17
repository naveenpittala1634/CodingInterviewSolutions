
package demopack1;

public class ContiguogsSubArraySumKadanes {
	 public static void main (String[] args) 
	    { 
	        int [] a = {-2, -3, -4, 1, -2, -1, 5, -3, 8}; 
	        System.out.println("Maximum contiguous sum is " + 
	                                       maxSubArraySum(a)); 
	    } 
	    static int maxSubArraySum(int a[]) 
	    { 
	        int size = a.length; 
	        int max = Integer.MIN_VALUE, max1 = 0; 
	        for (int i = 0; i < size; i++) 
	        { 
	            max1 = max1 + a[i]; 
	            if (max < max1) 
	                max = max1; 
	            if (max1 < 0) 
	                max1 = 0; 
	        } 
	        return max; 
	    } 
	

}
