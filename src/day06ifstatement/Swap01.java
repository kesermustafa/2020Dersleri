package day06ifstatement;

import java.util.Scanner;

public class Swap01 {

	public static void main(String[] args) {
		
		/*
		 a variable degeri 12, b variable degeri 25 olsun.
		 oyle bir kod yazin ki a 25 b 12 olsun.
		 sayilari kullanicidan alin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("iki sayi girirniz");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("a: " + a);
		System.out.println("b: " + b); 
		
		System.out.println("**************");
		
		
		// kullanici a ya 12   b ye 25 girdigini dusunursek: 
		//1.YOL 
		double temp = 0;
		temp = a; // temp = 12 oldu     a`nin degeri ayni kaldi 
		a = b;    // temp = 12  a = 25   b = 25   oldu 
		b = temp; // temp = 12  a = 25   b = 12 oldu. 
		// Javada yeni gelen deger eskiyi oldurur,
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		
		//2.YOL  : Ucuncu bir variable kullanma
		
		a = a + b;  // a 37 oldu b 12 degismedi 
		b = a - b;  // b 37-12 = 25 oldu  a 37 degismedi
		a = a - b;  // a 37-25 = 12 oldu
		
		System.out.println("**************");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		scan.close();
	
		
	}

}
