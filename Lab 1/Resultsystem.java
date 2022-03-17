package Studentdetails;
import java.util.Scanner;
public class Resultsystem {
	String result;
	int marks;

	Scanner s;
	
	void input()
	{
		s= new Scanner(System.in);
		System.out.println("enter marks");
		marks= s.nextInt();
	}
	

	void result()
	{
		String result=marks>=40 ? "pass"  :"fail";
	      System.out.println(result);
	}

	public static void main(String[] args) {
		
		Resultsystem r = new Resultsystem();
		r.input();
		r.result();
		

	}

}
