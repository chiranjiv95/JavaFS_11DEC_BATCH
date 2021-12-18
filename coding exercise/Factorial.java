package factorailProject;

import java.util.Scanner;

public class Factorial
{
   public static void main(String[] args) 
   {
	int num;
	long fact=1;
	
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number: ");
	num=obj.nextInt();
	
	for(int i=1; i<=num;i++)
		fact=fact*i;
	System.out.println("Factorial of number " + num + " is : " + fact);
	}
   
     
}
