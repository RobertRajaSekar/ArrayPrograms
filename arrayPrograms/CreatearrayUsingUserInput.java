package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CreatearrayUsingUserInput {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Size of an array ");
		int size=s.nextInt();
		
		int [] a= new int[size];
		
		System.out.println("Enter the numbers");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
	}
}
