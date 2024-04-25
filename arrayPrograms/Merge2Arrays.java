package arrayPrograms;

import java.util.Arrays;

public class Merge2Arrays {
public static void main(String[] args) {
	int [] a= {1,2,3,4,5};
	int [] b= {6,7,8,9,10,11};
	int [] c=new int [a.length+b.length];
	int j=0;
	for(int i=0;i<c.length;i++) {
		if(i<a.length) {
			c[i]=a[i];
		}
		else {
			c[i]=b[j];
			j++;
		}
	}
	System.out.println("a : "+Arrays.toString(a));
	System.out.println("b : "+Arrays.toString(b));
	System.out.println("c : "+Arrays.toString(c));
}
}
