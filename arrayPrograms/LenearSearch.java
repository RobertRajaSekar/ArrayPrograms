package arrayPrograms;

public class LenearSearch {
public static void main(String[] args) {
	int [] a= {2,3,5,7,3,1};
	int ele=7;boolean flag=false;
	for(int i=0;i<a.length;i++) {
		if(ele==a[i]) {
			flag=true;
			System.out.println("element is present");
			break;
		}
	}
	if(flag==false) {
		System.out.println("element not present");
	}
}
}
