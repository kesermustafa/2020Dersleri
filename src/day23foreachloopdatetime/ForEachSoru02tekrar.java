package day23foreachloopdatetime;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class ForEachSoru02tekrar {

	static int no = 1000;
	
	public static void main(String[] args) {
		
		/*
		 Gris yilini, ad ve soyadi kullanicidan alin.
		 Giris Yili + Ad ve Soyadini ilk harfleri + sira numarasi seklinde ogrenci numarasi olusturan pragrami yaziniz
		 */

		Scanner scan = new Scanner(System.in);
		String isim = "";
		int yil = 2025; 
		List<String>isimler = new ArrayList<>();
		
		
		do {
			System.out.println("Ad ve Soyadinizi giriniz");
			isim = scan.nextLine().toUpperCase();
			
			if (!isim.equalsIgnoreCase("X")) {
				isimler.add(isim);
		}
		}while(!isim.equalsIgnoreCase("X"));
		
		System.out.println(isimler);
		
		for(String w : isimler) {
			w.charAt(0);
			System.out.println(w + " id: " + yil%100 + "" + w.charAt(0) + w.charAt(w.indexOf(" ")+1) + no);
			no++;
		}
		scan.close();
		
		
		
		
		
		
		
		
	}

}
