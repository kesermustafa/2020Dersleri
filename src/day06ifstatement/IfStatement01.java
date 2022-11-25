package day06ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		/*
		 if it rains I will cancel picnic
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("iki sayi girirniz");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		if(a > b) {
			System.out.println("llk sayi buyuk");
		}

		if( a < b) {
			System.out.println("ikinci sayi buyuk");
		}
		
		if(a == b ) {
			System.out.println("iki sayi birbirine esit");
		}
		
		scan.close();
	}
}
