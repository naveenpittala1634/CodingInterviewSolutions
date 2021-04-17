/*
 
Polymorphism that is resolved during compiler time is known as static polymorphism.
Method overloading is an example of compile time polymorphism.
Method Overloading: This allows us to have more than one method having the same name, if the parameters 
of methods are different in number, sequence and data types of parameters. 
 
*/

package demopack1;

class SimpleCalculator
{
    int add(int a, int b)
    {
         return a+b;
    }
    int  add(int a, int b, int c)  
    {
         return a+b+c;
    }
}
public class CompileTimePolyMorphism
{
   public static void main(String args[])
   {
	   SimpleCalculator obj = new SimpleCalculator();
       System.out.println(obj.add(10, 20));
       System.out.println(obj.add(10, 20, 30));
   }
}
