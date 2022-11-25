package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfElseSoru01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan alacagi urun miktrini ve urun birim fiyatini alin'
		 Eger urun miktari 1000'den fazla ise kullaniciya %10 indirim yapin'
		 ve odemesi gerekentoplam fiyati ekrana yazdirin.
		 Diger durumlarda onemesi gereken toplam parayi lndirimsiz olarak ekrana yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Urun miktarini giriniz");
		int qty = scan.nextInt();
		System.out.println("Birim fiyat giriniz");
		double price = scan.nextDouble();
		
		if(qty>1000) {
			System.out.println("%10 Indirimli fiyat: " + ((price-(price*10/100))*qty)); // Benim yazdiklarim...
			System.out.println("%10 Indirimli fiyat: " + price*0.9*qty);
			System.out.println("%10 Indirimli fiyat: " + ((price*qty)-((price*qty)*10/100))); // Benim yazdiklarim...
		}else {
			System.out.println("Indirimsiz fiyat: " + price*qty);
		}
		
		scan.close();
	}

}
