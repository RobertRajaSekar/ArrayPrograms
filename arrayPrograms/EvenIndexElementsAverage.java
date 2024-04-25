package arrayPrograms;

public class EvenIndexElementsAverage {
	public static void main(String[] args) {
		int[] a= {5,1,10,3,11,2,6,12};
		int sum=0;int count=0;

		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				sum=sum+a[i];
				count++;
			}
		}
		int avg=sum/count;
		System.out.println(avg);
	}
}
