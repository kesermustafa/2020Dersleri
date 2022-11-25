package day15variabletypeMethodCreation;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir string alin
		 Bu Stringin icinde kac tane harf, kac tane rakam, kac tane harf ve rakam disi 
		 karakter oldugunu gosteren program yazin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz");
		String s = scan.nextLine().toLowerCase();
		
		
		int harfCounter = 0;
		int rakamCounter = 0;
		int digerCounter = 0;
		
		int k = 0;
		
		do {
			if(s.charAt(k)>='a' && s.charAt(k)<='z') {
				harfCounter++;
			}else if (s.charAt(k)>='0' && s.charAt(k)<='9') {
				rakamCounter++;
			}else {
				digerCounter++;
			}
			k++;
		}while(k < s.length());
		
		System.out.println("Harf Sayisi :" + harfCounter);
		System.out.println("Rakam Sayisi :" + rakamCounter);
		System.out.println("Diger Sayisi :" + digerCounter);
		
		scan.close();
	}
}
