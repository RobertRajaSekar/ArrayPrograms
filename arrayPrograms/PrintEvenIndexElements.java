package arrayPrograms;

public class PrintEvenIndexElements {
	public static void main(String[] args) {
		int[] a= {2,3,7,21,-1,5,9};

		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);	
			}
		}
	}
}
