package day12forloop;

import java.util.Scanner;

public class ForLoop08 {

	public static void main(String[] args) {
		/*
		 Kullanicaidan baslangic ve bitis degerlerini alin 
		 baslangic ve bitis degerleri  nasil olursa olsun baslangic degerinden bitis degerine kkadar 
		 tum sayilarin carpimini hesaplayan programi yapiniz.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic sayisi giriniz");
		int Bas = scan.nextInt();
		
		System.out.println("Bitis sayisi giriniz");
		int Bit = scan.nextInt();
		
		int carpim = 1;
		
		if (Bas<=Bit) {
			
			for (int i=Bas ; i<=Bit ; i++) {
				carpim = carpim * i;
			}
					
		} else {
			for (int i=Bas ; i>=Bit ; i--) {
				carpim = carpim * i;
			}
		}
		System.out.println("Carpim : " + carpim);
			
		scan.close();
	
	}
}
