package day08ternary;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger:
		iki kenar uzunlugu birbirne esitse "Ikizkenar Ucgen"
		diger durumda "Ikiz kenar degil" yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin kenar uzunluklarini giriniz");
		double d1 = scan.nextDouble();
		double d2 = scan.nextDouble();
		double d3 = scan.nextDouble();
		
		String resualt = d1==d2 || d2==d3 || d1==d3 ? "Ikiz kenar Ucgen" : "Ikiz kenar degil";
		System.out.println(resualt);
		
		scan.close();
	}

}
