package day06ifstatement;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		/*
		 kullanicidan bir sayi alin
		 bu sayi cift sayi ise console "cift" 
		 tek sayi ise console "tek" yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir integer girirniz");
		int a = scan.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("cift");	
		}
		
		if(a % 2 != 0) {
			System.out.println("Tek");
		}
		scan.close();
	}

}
