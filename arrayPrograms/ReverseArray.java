package arrayPrograms;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] a= {3,6,21,35,4,21,33};
		int[] b=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
			b[j]=a[i];
			j++;
		}
		System.out.println(Arrays.toString(b));


		//	AnotherWay
		System.out.println("-----Another Way-----------");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}
