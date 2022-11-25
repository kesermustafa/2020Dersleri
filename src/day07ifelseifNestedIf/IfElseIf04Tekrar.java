package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfElseIf04Tekrar {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir yil alin 
		 Eger yil 1000'e bolunuyorsa "Milenyum"
		 Eger yil 100'e  bolunuyorsa "Yuzyil" 
		 Eger yil 10'a   bolunuyorsa "Onyil" yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		int Y = scan.nextInt();
		
		if(Y<= 0) {
			System.out.println("Negatif ve 0 yil kabul edilmez");
		}else if(Y % 1000 == 0) {
			System.out.println("Milenyum");
		}else if(Y % 100 == 0) {
			System.out.println("Yuzyil");
		}else if(Y % 10 == 0) {
			System.out.println("Onyil");
		}else {
			System.out.println("Hicbiri degil");
		}
		scan.close();
	}
}
