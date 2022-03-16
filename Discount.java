package Studentdetails;

import java.util.Scanner;

public class Discount {

	String pname;
	int price;
	Scanner s;
	void input()
	{
		s= new Scanner(System.in);
		System.out.println("enter product name ");
		pname= s.next();
		System.out.println("enter price ");
		price= s.nextInt();
		
	}
	void display()
	{
		System.out.println("Your product name is");
		System.out.println(pname);
		System.out.println("Your product price is");
		System.out.println(price);
	}
	
	void calculate()
	{
		if(price>2000)
			System.out.println("and the discount is 10% of the price" );
		else
			System.out.println("and the discount is 7% of the price" );
	}
	static void banner()
	{
		System.out.println("Thank you.");
	}
	public static void main(String[] args) {
	   Discount d= new Discount();
	   d.input();
	   d.display();
	   d.calculate();
	   d.banner();
	   
	}

}