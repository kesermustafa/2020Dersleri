package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ls = new ArrayList<>();
		ls.add("A");
		ls.add("M");
		ls.add("B");
		ls.add(1, "K");
		ls.add(0, "S");
		ls.add("T");
		System.out.println(ls);
		
		//List'ler de eleman sayisini bulma nasil yapilir.
		//Arraylarin eleman sayisidan bahsederken Array'in length i  deyiniz
		//List'in eleman sayisidan bahsederken "List'in Size"i deyiniz,
		System.out.println(ls.size()); // 6 eleman var.
		
		System.out.println(ls.isEmpty());
		
		//bir list den index kullanarak eleman silmek
		System.out.println(ls.remove(2));
		System.out.println(ls);
		
		
		System.out.println(ls.contains("B")); 
		
		
	}
}
