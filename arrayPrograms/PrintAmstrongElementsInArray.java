package arrayPrograms;

public class PrintAmstrongElementsInArray {
	public static void main(String[] args) {
		System.out.println("The Amstrong Numbers of an Given array are : ");

		int [] a= {153,4070,1634,371};
		for(int i=0;i<a.length;i++) {
			int n = a[i];
			int temp = n;
			int count = 0;
			int sum = 0;

			while (temp > 0) {
				temp = temp / 10;
				count++;
			}
			temp = n; 

			while (temp > 0) {
				int digit = temp % 10;
				int power = 1;

				for (int j = 0; j < count; j++) {
					power *= digit;
				}
				sum += power;
				temp = temp / 10;
			}
			if (sum == n) {
				System.out.println(n);
			}
		}
	}
}
