package programs1;

public class _9SmallestNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {80,20,40,50,60};
        int temp;
        
        for(int i=0;i<a.length;i++) {
        	for(int j=i+1;j<a.length;j++) {
        		if(a[i]>a[j]) {
        			temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;}
        		
        	
        	}	
        	}
        System.out.println(a[0]);
        	
        }
	}


