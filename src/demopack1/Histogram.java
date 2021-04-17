package demopack1;

import java.util.Scanner;
import java.util.Stack;

public class Histogram {
	
		public static void main (String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    while (t > 0) {
		        int n = sc.nextInt();
		        long[] arr = new long[n];
		        
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextLong();
		        }
		        long area = maxArea(arr);
		        System.out.println(area);
		        t--;
		    }
		}
		
		public static long maxArea(long[] arr) {
		    Stack<Integer> stack = new Stack<>();
		    long maxArea = 0L;
		    int i = 0;
		    int n = arr.length;
		    
		    while (i < n) {
		        if (stack.isEmpty() || arr[i] >= arr[stack.peek()]) {
		            stack.push(i);
		            i++;
		        }
		        else 
		        {
		            int p = stack.pop();
		            long h = arr[p];
		            long w = (long)(stack.isEmpty() ? i : i - stack.peek() - 1);
		            maxArea = Math.max(maxArea, h * w);
		        }
		    }
		    
		    while (!stack.isEmpty()) {
		        int p = stack.pop();
		        long h = arr[p];
		        long w = stack.isEmpty() ? i : i - stack.peek() - 1;
		        maxArea = Math.max(maxArea, h * w);
		    }
		    
		    return maxArea;
		}
	}


