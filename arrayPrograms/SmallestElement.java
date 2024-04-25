package arrayPrograms;

public class SmallestElement {
	public static void main(String[] args) {
		int [] a= {7,11,-1,2,0,-3};
		//assume 1st element is smallest
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Smallest Element is : "+min);
	}
}
