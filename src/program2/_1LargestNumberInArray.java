package program2;

public class _1LargestNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {40,80,70,50,60};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					System.out.println(a[i]);
				}
			}
		}
		System.out.println(a[0]);

	}

}
