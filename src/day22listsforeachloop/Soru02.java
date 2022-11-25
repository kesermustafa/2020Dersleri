package day22listsforeachloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan tam ismini alin
		 isim harflerini bir listeye ekleyin.
		 Harfleri alfabetik sirada buyuk harf olarak yazdirin
		 Harfleri alfabetik siranin tersinden buyuk harf olarak yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi giriniz.");
		
		String name = scan.nextLine().replace(" ", "").toUpperCase();
		
		List<Character> harfler = new ArrayList<>();
		
		//Var olan siralamada yazdirmak
		for(int i=0; i<name.length(); i++) {
			harfler.add(name.charAt(i));
		}
			
		System.out.println(harfler);
		
		//Alfabetik siralama
		Collections.sort(harfler);
		System.out.println(harfler);
		
		//Alfabetik siralama tersi
		//1.yol
		List<Character> harflerTers = new ArrayList<>();
		for(int i=harfler.size()-1; i>=0; i--) {
			harflerTers.add(harfler.get(i));
		}
		System.out.println(harflerTers);
		
		//2.yol
		Collections.reverse(harfler);
		System.out.println(harfler);
		
		scan.close();
	}

}
