package day20multidimensonalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	/*
	 1) Listler primitive data type lari kabul etmez. Primitiv data type lar yerine wrapper class lari kullaniriz.
	 */
	
	public static void main(String[] args) {
		// ArrayList olusturmak
		
		//      1.YOL 
		// ArrayList<Integer> list1 = new ArrayList<Integer>(); 
		
		//      2.YOL
		// ArrayList<Integer> list2 = new ArrayList<>(); 
		
		//      3.YOL  Recommended
		List<Integer> list3 = new ArrayList<>();
		
		System.out.println(list3); // []
		
		// List'e eleman eklemek
		list3.add(12);
		System.out.println(list3); // [12]
		
		list3.add(13);
		System.out.println(list3); // [12, 13]
		
		
		
	}
}
