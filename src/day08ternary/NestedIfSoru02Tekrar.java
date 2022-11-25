package day08ternary;

import java.util.Scanner;

public class NestedIfSoru02Tekrar {

	public static void main(String[] args) {
		
		/*
		 Kullanicidan bir harf girmesini isteyin.
		 
		 Girdigi kucuk harf ise harfin "a" olup olmadigini kontrol edin.
		 Harf "a" ise "Ilk kucuk harf" yazdirin.
		 "a" degil ise ekrama "Ilk kucuk  harf degil" yazdirin.
		 
		 Girdigi kucuk harf ise harfin "Z" olup olmadigini kontrol edin.
		 Harf "Z" ise "Son buyuk harf" yazdirin.
		 "Z" degil ise ekrama "on buyuk  harf degil" yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char h = scan.next().charAt(0);
		
		if(h >= 'a' && h<= 'z') {
			if(h=='a') {
			System.out.println("Ilk kucuk harf");
			}else {
			System.out.println("Ilk kucuk  harf degil");
			}
			
			
		} else if (h >= 'A' && h<= 'Z'){
			if(h == 'Z') {
				System.out.println("Son buyuk harf");
			} else {
				System.out.println("Son buyuk harf degil");
			} 
		} else {
			System.out.println("Lutfen harf giriniz.");
			}
		scan.close();
	}
}

		
			
		