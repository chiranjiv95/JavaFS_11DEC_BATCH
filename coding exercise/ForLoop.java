package multiplication;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args)
	{
		int num;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		num=obj.nextInt();		
		for (int i=0; i<=10;i++)
			System.out.println(num +"x"+ i+ " = "+ (num*i));
		obj.close();
	}		
}

