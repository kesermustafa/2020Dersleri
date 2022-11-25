package day06ifstatement;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir karakter ailiniz 
		 bu karakter harf ise console harf yazdirin.
		 Harf degil yazdirin. 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir character girirniz.");
		char ch = scan.next().charAt(0);
		
		
		if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')) {
			System.out.println("Harf");
		}else {
			System.out.println("1Harf degil");
		}
		
		scan.close();
	}

}
