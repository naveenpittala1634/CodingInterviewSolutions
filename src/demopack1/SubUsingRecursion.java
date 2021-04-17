package demopack1;
import java.util.Scanner;
public class SubUsingRecursion
{
public static void main(String args[]){
int sub;
Scanner scan=new Scanner(System.in);
//create a scanner instance for receives input
// from the user - input from keyboard
System.out.print("Enter the value to num1: ");
int num1=scan.nextInt();
System.out.print("Enter the value to num2: ");
int num2=scan.nextInt();
//reads the numbers from the user
//input from keyword
sub=subtract(num1,num2);//call te method
System.out.print("Subtraction of two numbers: "+sub);
}
static int subtract(int num1, int num2)//method definition
{
    if(num2==0)
        return num1;
    else
        return subtract((num1-1),(num2-1));
    
}
}