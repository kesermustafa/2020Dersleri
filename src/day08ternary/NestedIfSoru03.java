package day08ternary;

import java.util.Scanner;

public class NestedIfSoru03 {

	public static void main(String[] args) {
		/*
		Kullanicidan Password girmesini isteyin.
		
		Girdigi password 5`e bolunuyorsa son rakamini kontrol edin.
		Son rakami 0 ise ekranai "5`e bolunen cift sayi"
		Son rakami sifir degilse 5`e bolunmeyen tek sayi yazdirin.
		
		Girdigi sayi 5`bolunmuyorsa "Tekrar Deneyin" yazdirin.
		
		if (p >= 100000 && <= 999999) {
			
		}else 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Password giriniz");
		int p = scan.nextInt();
		
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
