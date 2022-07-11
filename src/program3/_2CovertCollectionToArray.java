package program3;

import java.util.*;
public class _2CovertCollectionToArray {

	public static void main(String[] args) {
		
		List<String>name=new ArrayList<String>();
		
		name.add("Akash");
		name.add("Tushar");
		
		
		
		String names[]=name.toArray(new String[name.size()]);
		for(String namelist:names) {
			System.out.println(namelist);
			
			
			List<Integer>list=new ArrayList<>();
			
			list.add(1);
			list.add(2);
			list.add(3);
			
			Integer numberlist[]=list.toArray(new Integer[list.size()]);
			
			for(Integer lists:numberlist) {
				System.out.println(lists);
			}
		}

	}

}
