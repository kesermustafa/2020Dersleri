package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir yil alin 
		 Eger yil 1000'e bolunuyorsa "Milenyum"
		 Eger yil 100'e  bolunuyorsa "Yuzyil" 
		 Eger yil 10'a   bolunuyorsa "Onyil" yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Yil giriniz.");
		int yil = scan.nextInt();
		
		if(yil <= 0 ) {
			System.out.println("Negatif veya sifir yil kabul edilmez.");
		}else if(yil % 1000 == 0) {
			System.out.println("Milenyum");
		}else if(yil % 100 == 0) {
			System.out.println("Yuzyil");
		}else if(yil % 10 == 0) {
			System.out.println("Onyil");
		}else {
			System.out.println("Hicbiri");
		}
		
		scan.close();
	}

}
