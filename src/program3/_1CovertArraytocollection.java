package program3;

import java.util.*;
import java.util.stream.Collectors;

public class _1CovertArraytocollection {

	public static void main(String[] args) {
		
		String name[]= {"i","am","java"};
	//	
		
		
		
		List<String>namelist=Arrays.asList(name);
		for(String names:namelist) {
			System.out.println(names);
			}

		int list[]= {10,20,30,40,50};
		
		List<Integer> numberlist=Arrays.stream(list).boxed().collect(Collectors.toList());
		
		for(Integer lists:numberlist) {
			System.out.println(lists);
		}

		
	}

}
