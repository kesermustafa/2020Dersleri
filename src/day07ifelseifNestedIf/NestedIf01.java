package day07ifelseifNestedIf;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin;
		 Eger sayi pozitif ise;
		 10 dan buyuk olup olmadigini kontrol edin,
		 Eger 10'dan buyuk ise "Buyuksun"
		 Eger 10'dan kucuk ise "Normalsin" yazdirin.
		 
		 Eger sayi pozitif degil ise;
		 -10'dan uyuk olup olmadigini kontrol edin,
		 Eger -10'dan buyuk ise "Negatifsin"
		 Eger -10'dan kucuk ise "Cok Negatifsin" yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Tamsayi giriniz.");
		int s = scan.nextInt();
		
		if(s>0) {
			if(s>10) {
				System.out.println("Buyuksun");
			}else {
				System.out.println("Normalsin");
			}
		}else {
			if(s>-10) {
				System.out.println("Negatifsin");
			}else 
				System.out.println("Cok Negatifsin");
		}
		scan.close();
	}
}
