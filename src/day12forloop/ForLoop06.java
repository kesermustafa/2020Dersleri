package day12forloop;

import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		/*
		 baslangic ve bitis degerlerini kullanicidan alin ve
		 baslangic degerinden bitis degerine kadar tum tam sayilarin toplamini hesaplayan programi yapin.
		 		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic sayisini girin");
		int bs = scan.nextInt();
		
		System.out.println("Bitis sayisini girin");
		int bt = scan.nextInt();
		
		int toplam = 0;
	
		for(int i=bs ; i<=bt ; i++) {
			toplam = toplam+i;
		}
		System.out.println("Toplam; " + toplam);
		
		
		scan.close();
		
	}

}
