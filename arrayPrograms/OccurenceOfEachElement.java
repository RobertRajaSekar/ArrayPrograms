package arrayPrograms;

public class OccurenceOfEachElement {
public static void main(String[] args) {
	int [] a = {7,3,7,2,1,-1,3,7,-1};
//	outter for loop for traversing array element
	for(int i=0;i<a.length;i++) {
		int count=1;
//		inner for loop for comparing with traversed element
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				a[j]=Integer.MAX_VALUE;//max-value-->because assign some random value 
			}
			
		}
		if(a[i]!=Integer.MAX_VALUE)
			System.out.println("occurence of  "+ a[i]+" is "+count);
		
		}
}
}
