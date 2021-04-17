//Usage of this statement. using this one constructor can call another constructor

package demopack1;

public class Constructor {
	int l;
	int w;
	int h;
	Constructor(int a,int b,int c)
	{
		this(a,b);
		h=c;
		
	
		System.out.println(h);
	}
	Constructor(int a,int b)
	{
		l=a;
		w=b;
		System.out.println(l);
		System.out.println(w);
		
	}
	
	
	public static void main(String[] args)
	{
		Constructor c=new Constructor(67,4,5);
		Constructor c1=new Constructor(91,23);
		
	}

}
