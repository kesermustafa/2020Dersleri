package day12forloop;

import java.util.Scanner;

public class ForLoop06Tekrar {

	public static void main(String[] args) {
		/*
		 baslangic ve bitis degerlerini kullanicidan alin ve
		 baslangic degerinden bitis degerine kadar tum tam sayilarin toplamini hesaplayan programi yapin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic icin tam sayi giriniz");
		int Bs = scan.nextInt();
		
		System.out.println("Bitis icin tam sayi giriniz.");
		int Bt = scan.nextInt();
		
		int toplam = 0;
		
		if (Bs>Bt) {
			System.out.println("Baslangic degeri bitis degerinden kucuk olamaz");
		}else
			
			for(int i=Bs ; i<=Bt ; i++) {
				toplam = toplam + i;
		}
		System.out.println("Toplam : " + toplam);
		
		scan.close();
	}

}
