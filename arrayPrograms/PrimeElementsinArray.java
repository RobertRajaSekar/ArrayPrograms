package arrayPrograms;

public class PrimeElementsinArray {
	public static void main(String[] args) {
		int[]a= {5,7,6,11,97,2,12};
		for(int i=0;i<a.length;i++) {
			int count= 0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==2)
				System.out.print(a[i]+" ");
		}

	}
}
