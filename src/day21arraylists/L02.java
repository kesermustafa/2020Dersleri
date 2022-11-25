package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		// Bir elemani degistirme
		
		List<String> sl = new ArrayList<>(); 

		sl.add("Ali");
		sl.add("Kemal");
		sl.add("Ayse");
		
		System.out.println(sl);
		
		//Bir elemani degistirme
		sl.set(0, "Aliye");
		sl.set(1, "Mahmut");
		System.out.println(sl);
		
		//Bir elemanin varligini kontrol etmek
		System.out.println(sl.contains("Kemal")); // true
		System.out.println(sl.contains("Wwwww")); // false
		
		//Elemanlari natural order a gore nasil dizeriz.
			// kucuktem buyuge + alfabetik siraya gore
		Collections.sort(sl); // ==> cok kullanilir.
		System.out.println(sl);
		
		//Elemanlari Natural  order in tersine gore siralam.
		Collections.reverse(sl);
		System.out.println(sl);
		
		//List'in icindeki tum elemanlari silmek 
		sl.clear();
		System.out.println(sl); // []
		
		// Iki listin esit olup olmadigini nasil kontrol ederiz. 
		List<Integer> il1 = new ArrayList<>();
		
		il1.add(12);
		il1.add(13);
		il1.add(14);
		
		List<Integer> il2 = new ArrayList<>();
		
		il2.add(12);
		il2.add(13);
		il2.add(14);
		
		System.out.println(il1.equals(il2)); // esitse true degilse false dondurur.
											 // hem elemanlari hem de elemanlarin yerlerini (index) kontrol eder.
		
		
	}

}
