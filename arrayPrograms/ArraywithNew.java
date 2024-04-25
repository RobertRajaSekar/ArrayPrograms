package arrayPrograms;

public class ArraywithNew {
public static void main(String[] args) {
//Create Array	
//	data-type [] ref-var=new data-type[size];

	int[] a=new int[4];
//Storing Data	
//	ref-var[index]=value;

	a[0]=100;
	a[2]=500;
//Fetching Data
//	ref-var[index]

	System.out.println(a[0]);
	System.out.println(a[3]);
	
//	Length of an array
	System.out.println(a.length);
	
//	fetch all elements using for loop
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
