package day11stringmethods;

import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {
		/*
		 kullanicidan password aliniz.  
		 2 - password ilk karakter Buyuk harf olacak olacak
		 3 - son karakter sayi olacak 
		 4 - en az 6 karakter uazunlugunda olacak. 
		 
		 sartlari sagliyorsa ekrana password basariyla olusturuldu yaziniz
		 sartlari saglamiyorsa ekrana tekrar deneyiniz.  yaziniz
		 */
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Lutfen password giriniz");
		String psw = scan.nextLine();
		
			if ((psw.charAt(0)>= 'A' && psw.charAt(0)<='Z') &&
					(psw.charAt(psw.length()-1)>='0' && psw.charAt(psw.length()-1)<='9') && 
					psw.length()>5){
				System.out.println("password basariyla olusturuldu");
			}else {
				System.out.println("tekrar deneyiniz");
			}
		
		scan.close();
	}
}
