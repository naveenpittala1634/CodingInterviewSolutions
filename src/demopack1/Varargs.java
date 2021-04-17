package demopack1;

public class Varargs {
	public static void main(String[] args) {
		int sum1=Add(2,3,10,12,13);
		System.out.println(sum1);
		
	}
	public static int Add(int ...a)
	{
		int sum=0;
		int count=0;
		for(int i:a)
		{
			sum=sum+i;
	
		}
		
		return sum;  
		
	}

}
