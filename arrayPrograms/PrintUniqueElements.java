package arrayPrograms;

public class PrintUniqueElements {
public static void main(String[] args) {
	int [] a = {10,2,10,2,3,5,4};

	for(int i=0;i<a.length;i++) {
		int count=1;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				a[j]=Integer.MAX_VALUE;
			}	
		}
		if(count==1 && a[i]!=Integer.MAX_VALUE) {
			System.out.println("unique elements are "+a[i]);
		}	
		}
}
}
