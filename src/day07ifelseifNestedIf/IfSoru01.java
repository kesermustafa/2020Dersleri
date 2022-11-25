package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfSoru01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir gun alin eger gun
		 Cuma ise Muslumanlar icin kutsal gun yazdirin
		 Cumartesi ise Yahudiler icin kutsal gun yazdirin
		 Pazar ise icin kutsal gun yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Haftanin bir gun ismi giriniz");
		String day = scan.nextLine();
		
		//Stringlerde kesinlikle == kullanilmaz.
		// "==" primitive data type larda kullanin.
		//equals iki stringi buyuk kucuk harfi dikkate alarak karsilastirir.
		//equalsIgnoreCase() iki stringi buyuk kucuk harfi dikkate almadan karsilastirir.
		//String ler ayni ise true, farkli ise false return eder.
		if(day.equalsIgnoreCase("Cuma")){
			System.out.println("Muslumanlar icin kutsal gun");
		}
		
		if(day.equalsIgnoreCase("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
		}
		if(day.equalsIgnoreCase("Pazar")) {
			System.out.println("Hristiyanlar icin kutsal gun");
		}
		if(!day.equalsIgnoreCase("Cuma")&& !day.equalsIgnoreCase("Cumartesi") && !day.equalsIgnoreCase("Pazar") ) {
			System.out.println("Boyle bir kutsal gun yok");
		}
		scan.close();
	}

}
