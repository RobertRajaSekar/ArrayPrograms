package arrayPrograms;

import java.util.Arrays;

public class InsertElementParticularIndex {
public static void main(String[] args) {
	int [] a= {1,2,3,5,6,7};
	int [] b=new int[a.length+1];
	int index=3,ele=4;int j=0;
	for(int i=0;i<b.length;i++) {
		if(i==index) {
			b[i]=ele;
		}
		else {
			b[i]=a[j];
			j++;
		}
	}
	System.out.println(Arrays.toString(b));
}
}
