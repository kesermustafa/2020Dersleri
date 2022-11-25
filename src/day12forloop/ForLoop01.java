package day12forloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		// 79. VIDEO 
		
		/*
		 Kullanicidad baslangic ve bitis degerlerini alin 
		 Baslangic degerinden baslayip bitis degerinde biten tum sayilari ekrana yazdirin,
		 
		 Ornek ; kullanici 10 ve 15 veririse ==> 10 11 12 13 14 15
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic sayisi giriniz");
		int Bs = scan.nextInt();
		
		System.out.println("Bitis sayisi giriniz");
		int Bt = scan.nextInt();
		
		if (Bs>Bt) {
			System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
		} else
			
			for(int i=Bs ; i<=Bt ; i ++) {
				System.out.print(i + " ");
			}
		
		scan.close();
	}
}
