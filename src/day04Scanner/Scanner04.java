package day04Scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		//kullanicidan bir dikdortgenin uzun ve kisa kenarini alip ekrana yazdiran programi olustururnrz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdortgenin kisa kenarini giriniz");
		double kisa = scan.nextDouble();
		System.out.println("Dikdortgenin uzun kenarini girin");
		double uzun = scan.nextDouble();
		
		System.out.println("Alan= " + kisa*uzun);
		
		System.out.println("Cevre= " + (2*kisa + 2*uzun));
		
		scan.close();
	}

}
