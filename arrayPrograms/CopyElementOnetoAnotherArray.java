package arrayPrograms;

import java.util.Arrays;

public class CopyElementOnetoAnotherArray {
public static void main(String[] args) {
	int [] a= {5,6,7,8,9,10};
	int [] b=new int[a.length+2];int j=0;
	for(int i =0;i<a.length;i++) {
		b[j]=a[i];
		j++;
		}
	System.out.println(Arrays.toString(b));
}
}
