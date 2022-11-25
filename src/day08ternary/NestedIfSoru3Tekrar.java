package day08ternary;

import java.util.Scanner;

public class NestedIfSoru3Tekrar {

	public static void main(String[] args) {
		/*
		Kullanicidan en az 6 haneli Password girmesini isteyin.
		
		Girdigi password 5`e bolunuyorsa son rakamini kontrol edin.
		Son rakami 0 ise ekranai "5`e bolunen cift sayi"
		Son rakami sifir degilse 5`e bolunmeyen tek sayi yazdirin.
		
		Girdigi sayi 5`bolunmuyorsa "Tekrar Deneyin" yazdirin.
		
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("En az 6 haneli Password giriniz");
		int p = scan.nextInt();

		if( !(p >= 100000) ) {
			System.out.println("En az 6 haneli karakter giriniz");
			} else {
				
			}
		if(p % 5 == 0) {
			if(p % 10 == 0) {
				System.out.println("5`e bolunen cift sayi");
			} else {
				System.out.println("5`e bolunen tek sayi");
			}
		}else {
			System.out.println("Tekrar deneyin");
		}
		scan.close();
	}

}
