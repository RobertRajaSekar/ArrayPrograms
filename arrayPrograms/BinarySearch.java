package arrayPrograms;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int [] a= {4,3,6,1,9,-1};

		//	sort given array
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		//	enter element to be search
		int ele=9;
		//	declare l and r pointers
		int l=0,r=a.length-1;
		//	find mid pointer
		boolean flag=false;
		while(l<=r) {
			int mid=(l+r)/2;

			if(ele==a[mid]) {
				flag=true;
				System.out.println("Element Found");
				break;
			}
			else if(ele>a[mid]) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
	}
}
