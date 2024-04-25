package arrayPrograms;

import java.util.Arrays;

public class RemoveParticularElement {
public static void main(String[] args) {
	int [] a= {1,2,3,4,30,5,6,7};
	int[] b=new int[a.length-1];
	
	int index=4;int j=0;
	for(int i=0;i<a.length;i++) {
		if(i==index) {				//we can use only if block too
		}							//if(i!=index)							
		else{
			b[j]=a[i];
			j++;
		}
	}
	System.out.println(Arrays.toString(b));
	}
}
