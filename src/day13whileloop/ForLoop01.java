package day13whileloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan baslangic ve bitis harflerini alin;
		 ve baslsngic harfinden baslayip bitis harfinde biten tum harfleri buyuk harf olarak yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic ve bitis harflerini giriniz.");
		
		char bas = scan.next().toUpperCase().charAt(0);
		char bit = scan.next().toUpperCase().charAt(0);
		
		if (!(bas>= 'A' && bas<= 'Z') || !(bit>= 'A' && bit<= 'Z'))   {
			System.out.println("lutfen harf giriniz.");
			
		} else if (bas<=bit){
			for (char i=bas ; i<=bit ; i++) {
				System.out.print(i + " ");
			}
		}else {
			for (char i=bas ; i>=bit ; i-- ) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}
}
