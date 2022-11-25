package day08ternary;

import java.util.Scanner;

public class Ternary04 {

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

		System.out.println(qty>1000 ? price*0.9*qty : qty*price);
		scan.close();
	}

}
