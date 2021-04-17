package demopack1;

public class InheritanceDemo 
{
public static void main(String[] args)
{
	B obj=new B();
	obj.move();
	obj.run();

	
}
}
class A
{
	public void run()
	{
		System.out.println("move north");
	}
}
class B extends A
{
	public void move()
	{
		System.out.println("move east");
	}
}

