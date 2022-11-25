package day14whiledowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		/*
		 kullanicidan isim ve soy ismini alin
		 Kullanicinin ilk isminin ilk harfinden soy isminin son harfine kadar alfabede ki butun harfleri
		 buyuk harf olarak ayni satirda aralarinda bosluk birakarak yaziniz.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Adinizi giriniz");
		char ad = scan.nextLine().toUpperCase().charAt(0);
		
		System.out.println("Soydadinizi giriniz");
		String soy = scan.nextLine().toUpperCase();
		char sonHarf = soy.charAt(soy.length()-1);
		
		
		if (ad<=sonHarf) {
			while (ad<=sonHarf) {
				System.out.print(ad + " ");
				ad++;
			}
		}else {
			while (sonHarf<=ad) {
				System.out.print(sonHarf + " ");
				sonHarf++;
			}
		}
	
		scan.close();
	}

}
