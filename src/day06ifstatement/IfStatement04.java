package day06ifstatement;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		
		/*
		 Kullanicidan bir sayi alin
		 Sayi 3 basamakli ise console "3 Basamakli" yazdiririn.
		 Sayi 2 basamakli ise console "2 Basamakli"yazdirin
		 Sayi 3 basamakli vsya 2 basamakli degil ise console Ïkiside degil" yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi girirniz.");
		int a = scan.nextInt();
		
		if(a>99 && a<1000) {
			System.out.println("3 Basamakli");
		}
				
		if(a>9 && a<100) {
			System.out.println("2 Basamakli");
		}
		
		if(!(a>99 && a<1000) && !(a>9 && a<100)) {
			System.out.println("Ikiside degil");
		}
		
		scan.close();
	}
	
	
	

}
