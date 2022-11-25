package day05typecasting;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		/*
		     A
		    A A
		   A A A
		Seklini yapalim
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir karakter giriniz");
		char ch = scan.next().charAt(0);
		System.out.println("  " + ch + "  ");
		System.out.println(" " + ch + " " + ch + " ");
		System.out.println(ch + " " + ch + " " + ch);

		scan.close();
		
		
	}

}
