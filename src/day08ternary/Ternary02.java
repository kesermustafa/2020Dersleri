package day08ternary;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir tam sayi alin 
		 eger tam sayi 0 dan kucuk ise ekrana "Negatif"
		 diger durumda Negatif degil yaxdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int s = scan.nextInt();
		
		String a = s<0 ? "Negatif" : "Negatif Degil";
		System.out.println(a);
		
		scan.close();
	}

}
