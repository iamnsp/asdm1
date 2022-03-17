package Studentdetails;
import java.util.Scanner;
public class Numbersystem {
	String result;
	int number;

	Scanner s;
	
	void input()
	{
		s= new Scanner(System.in);
		System.out.println("enter number");
		number= s.nextInt();
	}
	

	void result()
	{
		String result=number>0 ? "positive number"  :"negative number";
	      System.out.println(result);
	}

	public static void main(String[] args) {
		
		Numbersystem n = new Numbersystem ();
		n.input();
		n.result();
		

	}

}
