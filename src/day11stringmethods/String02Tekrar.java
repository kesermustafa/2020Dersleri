package day11stringmethods;

import java.util.Scanner;

public class String02Tekrar {

	public static void main(String[] args) {
		/*
		 kullanicidan password girmesini isteyin.
		   
		 1 - Bos mu kontro et. 
		 2 - password ilk karakter Buyuk harf olacak olacak
		 3 - son karakter sayi olacak 
		 4 - en az 6 karakter uazunlugunda olacak. 
		 
		 sartlari sagliyorsa ekrana password basariyla olusturuldu yaziniz
		 sartlari saglamiyorsa ekrana tekrar deneyiniz.  yaziniz
		 */

		Scanner scan = new Scanner(System.in); 
		System.out.println("Lutfen password giriniz");
		String psw = scan.nextLine();
		
		if (psw.isEmpty()) {
			System.out.println("bos karakter kabul edilmez - Password olusturunuz ");
		} else if ((psw.charAt(0)>='A'&& psw.charAt(0)<='Z')&& (psw.charAt(psw.length()-1)>='0' && psw.charAt(psw.length()-1)<='9') && psw.length()>5) {
			System.out.println("Password basariyla olusturuldu");
			System.out.println(psw.replaceAll("\\S", "*"));
		} else {
			System.out.println("tekrar deneyiniz.");
		}
	scan.close();
		
	}

}
