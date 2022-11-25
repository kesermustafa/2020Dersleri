package day06ifstatement;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir character alin:
		 Bu character buyuk harf ise "Buyuk Harf" 
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir character girirniz");
		char ch = scan.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			System.out.println("Buyuk Harf");
		}
		if(ch>='a' && ch<='z') {
			System.out.println("Kucuk Harf");
		}
		if(!(ch>='A' && ch<='Z')&& !(ch>='a' && ch<='z')) {
			System.out.println("Harf Degil");
			}
		scan.close();
		
		
		
	}

}
