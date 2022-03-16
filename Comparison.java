package Studentdetails;

import java.util.Scanner;

public class Comparison {
	int num1;
	int num2;
	Scanner s;
	
	
	void numbers()
	{
		s= new Scanner(System.in);
		System.out.println("enter num1");
		num1=s.nextInt();
		System.out.println("enter num2");
		num2= s.nextInt();
	}
	
	void compare()
	{
		if (num1>num2)
		System.out.println(num1);
		
		else
			System.out.println(num2);
	}
	
	public static void main(String[] args) {
		Comparison c= new Comparison();
		c.numbers();
		c.compare();

	}

}
