package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfElseIf02Tekrar {

	public static void main(String[] args) {
		// Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger:
		// Uc kenar uzunlugu birbirine esitse "Eskenar Ucgen"
		// sadece iki kenar uzunlugu birbirne esitse "Ikizkenar Ucgen"
		//Tum kenarlar farkli ise "Cesitkenar ucgen" yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin kenar uzunluklarini giriniz");
		double d1 = scan.nextDouble();
		double d2 = scan.nextDouble();
		double d3 = scan.nextDouble();
		
		if(d1==d2 && d2 == d3){
			System.out.println("Eskenar ucgen");
		}else if(d1==d2 || d2==d3 || d1==d3) {
			System.out.println("ikiz kenar ucgen");
		}else {
			System.out.println("Cesit kenar ucgen");
		}
		scan.close();
	}

}
