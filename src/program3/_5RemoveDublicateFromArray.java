package program3;

import java.util.*;
public class _5RemoveDublicateFromArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,50,40,60,70};
		
		LinkedHashSet<Integer>hs=new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++) {
			
			hs.add(a[i]);
		}
		for(int no:hs) {
			System.out.println(no);
		}

	}

}
