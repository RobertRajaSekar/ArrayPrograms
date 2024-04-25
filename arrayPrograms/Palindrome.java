package arrayPrograms;

public class Palindrome {
	public static void main(String[] args) {
		int [] a= {2,3,5,7,5,3,2};
		int j=a.length-1;boolean flag=true;
		for(int i=0;i<=a.length/2;i++) {
			if(a[i]==a[j]) {
				j--;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
