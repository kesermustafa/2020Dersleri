package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi aliniz
		 Eger sayi 0 dan kucuk ise "Negatif"
		 0 ise "Notr"
		 0 dan buyuk ise "Pozitif" yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		double d = scan.nextDouble();
		
		if(d<0) {
			System.out.println("Negatif");
		}else if( d==0) {
			System.out.println("Notr");		
		}else {
			System.out.println("Pozitif");
		}
		scan.close();
	}

}
