package day14whiledowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan sayi aliniz sayi 10'dan kucuk ise "kazandiniz"
		 sayi 10 veya 10'dan buyukse "sayi giriniz" yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		
		int s = 0;
		
		do {
			System.out.println("Sayi giriniz");
			s = scan.nextInt();
		}while(s>=10);
		
		
		System.out.println("Kazandiniz");
		
		scan.close();
	}
}
