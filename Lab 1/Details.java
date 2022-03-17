package Studentdetails;

import java.util.Scanner;

public class Details {
	String name;
	int age;
	float salary;
	Scanner s;
	
	void entry()
	{
		s= new Scanner(System.in);
		System.out.println("enter the name of an employee");
		name= s.next();
		System.out.println("enter the age of an employee");
		age= s.nextInt();
		System.out.println("enter the salery of an employee");
		salary=s.nextFloat();
		
	}

	void display()
	{
		System.out.println(name +" "+age+" "+salary);
		
	}
	
	public static void main(String[] args) {
		Details s= new Details();
		
		s.entry();
		s.display();
		
	}
