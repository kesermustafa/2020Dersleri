package day08ternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		/*
		 artik yil : 100 e bolunen yillardan 400 e bolunenler artik yildir.
		             100 bolunmeyenlerden 4 e bolunenler artik yildir
		             
		             Kullanicidan alinan yilin artik yil olup olmadigini hesaplayan kod yazin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Yil giriniz");
		int yil = scan.nextInt();
				
		String result = yil%100==0 ? (yil%400==0 ? "Artik Yil" : "Artik Yil Degil") : (yil%4==0 ? "Artik Yil" : "Artik Yil Degil");
		System.out.println(result);
				
		scan.close();
	}
}
