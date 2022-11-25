package day16Constructors;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		/*
		 Kullanciya sayi girmesini soyleyin
		 Kullanici sifir girdiginde ekraka o ana kadar girmis oldugu tum sayilarin toplamaini yazdiriniz.
		 Ornegin 5, 4 , 7 , 0 ise 5+4+7=16 
		 */

		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		int num = 0;
		
		do {
			System.out.println("Bir sayi giriniz.");
			i=scan.nextInt();
			num = num + i;
			
		}while (!(i==0));
		
		System.out.println("Girilen sayilar toplami: " + num);
		
		scan.close();
	}
}
