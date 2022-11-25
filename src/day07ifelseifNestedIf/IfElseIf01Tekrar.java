package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfElseIf01Tekrar {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi aliniz
		 Eger sayi 0 dan kucuk ise "Negatif"
		 0 ise "Notr"
		 0 dan buyuk ise "Pozitif" yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int s = scan.nextInt();
		
		if (s<0) {
			System.out.println("Negatif");
		}else if (s > 0){
			System.out.println("Pozitif");
		}else {
			System.out.println("Notr");
		}
		scan.close();
	}

}
