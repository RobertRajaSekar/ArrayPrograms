package arrayPrograms;

import java.util.Arrays;

public class ReverseEachElementInArray {
	public static void main(String[] args) {
		int [] a= {209,321,452,179,109,32};


		for(int i=0;i<a.length;i++) {
			int n=a[i];
			int rev=0;
			while(n>0) {
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			a[i]=rev;
		}
		System.out.println(Arrays.toString(a));
	}
}
