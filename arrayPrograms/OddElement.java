package arrayPrograms;

public class OddElement {
	public static void main(String[] args) {
		int[] a= {5,1,6,7,9,10,2,6,15};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);	
			}
		}
	}
}
