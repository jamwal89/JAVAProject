import java.util.Scanner;

public class SomethingAboutYou { 
	public static void main( String[] args ) { 
		Scanner sc = new Scanner(System.in);

	String firstName;
	int age;
	String height;
	double gpa;

	System.out.print( "What is your first name? " );
	firstName = sc.next();
	System.out.print("My name is "+ firstName);
	
	System.out.print( "\nHow old are you? " );
	age =sc.nextInt();
	System.out.print("I am " +age+ " old");
	System.out.print( "\nHow tall are you? " );
	height = sc.next();
	System.out.print("My height is "+ height);

	System.out.print( "\nWhat is your GPA? " );
	gpa = sc.nextDouble();
	System.out.print("My GPA is "+gpa);
	

	}
}