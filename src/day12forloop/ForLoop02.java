package day12forloop;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 Kullanicidad baslangic ve bitis degerlerini alin 
		 Baslangic degerinden baslayip bitis degerinde biten tum cift sayilari ekrana yazdirin,
		 
		 Ornek ; kullanici 10 ve 20 veririse ==> 10 12 14 16 18 20
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic sayisi giriniz.");
		int Bs = scan.nextInt();
		
		System.out.println("Bitis sayisi giriniz");
		int Bt = scan.nextInt();
		
		if (Bs>Bt) {
			System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
		} else
		
			for(int i=Bs ; i<=Bt ; i++) {
				if (i%2==0) {
					System.out.print(i + " ");
				}
			}
			
		scan.close();
	}
}
