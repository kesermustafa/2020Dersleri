package day05typecasting;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bes basamakli bir sayi girirniz");
		int sayi = scan.nextInt();
		
		// bir sayinin son rakami (Birler basamagi) lazimsa Modulus islemi % kullanilir. 
		
		int sonRakam = sayi % 10;
		int ilkRakam = sayi / 10000;
		System.out.println("Toplam : " + (ilkRakam+sonRakam));
		
		scan.close();
		
				
	}
		
}
