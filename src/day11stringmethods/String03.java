package day11stringmethods;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		
		/*
		 Kullanicidan ad ve soyadini ve 11 haneli Kimlik numarasini alin
		 kullanici ad ve soyad yazarken hatayla bas ve sonuna space koyarsa siliniz.
		 Ad soyad ilk harfleri buyuk digerleri kucuk
		 kimlik numarasinin son dort rakami haric hepsi **** yap
		 ornek Ali Can *******1234
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ad ilk harfleri buyuk olarak giriniz.");
		System.out.println("Soyadinizi ilk harfleri buyuk olarak giriniz.");
		System.out.println("11 haneli kimlik numaranizi giriniz");
		String ad = scan.nextLine();
		String soyad = scan.nextLine();
		String no = scan.next();
		
		ad = ad.trim();
		soyad = soyad.trim();
		
		ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
		soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();
		
		System.out.println(ad);
		System.out.println(soyad);
		System.out.println(no.substring(0,7).replaceAll("\\d", "*") + no.substring(7,11));		
		
		scan.close();
	}

}
