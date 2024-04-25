package arrayPrograms;

public class PrintDublicateElements {
	public static void main(String[] args) {	
	int [] a = {7,3,7,2,1,-1,3,7};

	for(int i=0;i<a.length;i++) {
		int count=1;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				a[j]=Integer.MAX_VALUE;
			}	
		}
		if(count>1 && a[i]!=Integer.MAX_VALUE) {
			System.out.println("Dublicate elements are "+a[i]);
		}	
		}
}
}
