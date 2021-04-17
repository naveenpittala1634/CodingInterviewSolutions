/*
 Runtime Polymorphism (or Dynamic polymorphism)
It is also known as Dynamic Method Dispatch. Dynamic polymorphism is a process in which a call to 
an overridden method is resolved at runtime, thats why it is called runtime polymorphism
 */

package demopack1;

class ABC{
	   public void myMethod(){
		System.out.println("Overridden Method");
	   }
	}
	public class RunTimePolyMorphism extends ABC
	{

	   public void myMethod()
	   {
		System.out.println("Overriding Method");
	   }
	   public static void main(String args[]){
		   RunTimePolyMorphism obj = new RunTimePolyMorphism();
		obj.myMethod();
	   }
	}