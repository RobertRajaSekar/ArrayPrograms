package arrayPrograms;

public class LargestElement {
public static void main(String[] args) {
	int [] a= {6,11,21,31,60,50};
	//assume 1st element is largest
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("Largest Element is : "+max);
}
}
