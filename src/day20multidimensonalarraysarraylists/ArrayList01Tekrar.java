package day20multidimensonalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list3 = new ArrayList<>();
		list3.add(9);
		list3.add(7);
		System.out.println(list3);
		
		List<ArrayList<Integer>> list4 = new ArrayList<ArrayList<Integer>>();
		

		list4.add(new ArrayList<Integer>());
		list4.add(new ArrayList<Integer>());
		list4.add(new ArrayList<Integer>());
		list4.get(0).add(12);
		list4.get(0).add(17);
		list4.get(1).add(15);
		list4.get(1).add(0, 11);
		list4.get(1).add(1, 20);
		list4.get(2).add(list3.get(1));
		System.out.println(list4); 
		System.out.println(list4.get(1).get(1) * list4.get(0).get(0));
		 
		
		

	}

}
