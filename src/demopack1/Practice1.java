package demopack1;
import java.util.Scanner;
import java.util.Stack; 

 class Practice1 {
	 
	 public static void main(String[] args) 
	 { 
		 Scanner sc=new Scanner(System.in);
		int n = sc.nextInt(); 
		
		long n1=smallestNumber(n); 
		if(n1!=-1)
		{
			System.out.println(n1);
		}
		else
			System.out.println("Not possible");
	} 

	static long smallestNumber(int n) { 
	
		if (n >= 0 && n <= 9) { 
			return n; 
		} 


		Stack<Integer> digits = new Stack<>(); 

		
		for (int i = 9; i >= 2 && n > 1; i--) { 
			while (n % i == 0) { 
			
				digits.push(i); 
				n = n / i; 
			} 
		} 

		
		if (n != 1) { 
			return -1; 
		} 

		
		long k = 0; 
		while (!digits.empty()) { 
			k = k * 10 + digits.peek(); 
			digits.pop(); 
		} 

		
		return k; 
	} 


} 


