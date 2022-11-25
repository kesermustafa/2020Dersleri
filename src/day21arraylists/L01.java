package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class L01 {
	
	/* ===== LISTLER COK  ONEMLI  =====
	 Array birden fazla elemani depolamaya yarar Listler de ayni isi yapar. 
	 Array'in uzunlugu en basta belirlenir ve bir daha degistirilemez, belli ve sabittir. 
	 List'lerde ise uzunluk belirlemeye gerek yoktur cunku List'ler eleman eklendikce 
	 kendilerini buyutur eleman silindikce kendini kuculturler. 
	 List'ler Arraylarin gelismis halidir. 
	 2 - Listler cok kullanisli methodlara shiptir bu yuzden Array'lara tercih edilir.
	 3 - Array'lar primitiv ve referrence lari eleman olarak kabul ederler.
	     Ama List ler sadece non-primitive leri eleman olarak kabul ederler.
	 */
	
	public static void main(String[] args) {
		
		// List OLUSTURMAK 

		//1.YOL 
		ArrayList<String> sl1 = new ArrayList<String>(); 
		
		//2.YOL
		ArrayList<String> sl2 = new ArrayList<>();
		
		// 3.YOL == BUNU KULLANINIZ
		List<String> sl3 = new ArrayList<>();
		System.out.println(sl3);
		
		// LIST E ELEMAN EKLEME
		sl3.add("A");
		System.out.println(sl3);  // [A]
		
		sl3.add("B");    // add() methodu her zaman yeni elemani en saga ekler. 
		System.out.println(sl3); // [A, B]
				
		sl3.add("C");
		System.out.println(sl3); //[A, B, C]
		
		// Herhangi bir index e eleman ekleme;
		sl3.add(1, "X");
		System.out.println(sl3); //[A, X, B, C]
				
		sl3.add(0, "Mustafa");
		System.out.println(sl3); // [Mustafa, A, X, B, C]
		
		//List'ler de eleman sayisini bulma nasil yapilir.
		System.out.println(sl3.size()); // 5 eleman var.
		
		//Bir List'in bos olup olmadigini nasil anlarai.
		System.out.println(sl3.isEmpty());
		
		//Bir List'den eleman silme;
		//1.yol
		sl3.remove(0);
		System.out.println(sl3); //[A, X, B, C]  Mustafa silindi.
		
		//2.yol  eleman secip sil
		
		sl3.remove("X");
		System.out.println(sl3); //[A, B, C]
		
		sl3.add("B");
		System.out.println(sl3); //[A, B, C, B]
		
		sl3.remove("B");
		System.out.println(sl3); //[A, C, B]
		
		//Olmayan eleman silme ; hic bir sey olmadi, lists aynen birakir ve aynisini yazdirir.
		sl3.remove("W");
		System.out.println(sl3); // [A, C, B]
				
		sl1.add("A");
		sl2.add("D");
	}

}
