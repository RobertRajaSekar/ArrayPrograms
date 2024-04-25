package arrayPrograms;

import java.util.Scanner;

public class DynamicReading {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter non decimal number : ");
	int n=s.nextInt();
	System.out.println("number is : "+n);
	
	System.out.println("Enter decimal number : ");
	double d=s.nextDouble();
	System.out.println("decimal is : "+d);
	
	System.out.println("Enter String ");
	String str=s.next();
	System.out.println("String is : "+str);
	
	System.out.println("Enter a character data");
	char c=s.next().charAt(0);
	System.out.println("char is : "+c);
	
	s.close();
	
}
}
