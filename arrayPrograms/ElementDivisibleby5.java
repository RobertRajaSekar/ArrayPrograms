package arrayPrograms;

public class ElementDivisibleby5 {
	public static void main(String[] args) {
		int[]a= {5,6,3,30,4,40,25};
		for(int i=0;i<a.length;i++) {
			if(a[i]%5==0) {
				System.out.println(a[i]);	
			}
		}
	}

}

