package day08ternary;

import java.util.Scanner;

public class NestedIfSoru01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan cinsiyetini girmesini isteyin.
		 
		 Erkek ise yasini kontrol edin.
		 Yasi 18 den kucuk ise ekrana "Erkek cocuk"
		 Yasi 18 den buyuk esit ise ekrana "Adam" yazdirin.
		 Kadin ise yasini kontrol edin.
		 Yasi 18 den kucuk ise ekrana "Kiz cocuk"
		 Yasi 18 den buyuk esit ise ekrana "Kadin" yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Cinsiyetinizi Giriniz: Erkek / Kadin");
		String c = scan.next();
		System.out.println("Yasinizi Giriniz");
		int y = scan.nextInt();
		
		if(c.equalsIgnoreCase ("Erkek")) {
			if(y<18) {
				System.out.println("Erkek Cocuk");
			} else {
				System.out.println("Adam");
			}
		}else if (c.equalsIgnoreCase("Kadin")){
			if(y<18) {
				System.out.println("Kiz Cocuk");
			}else {
				System.out.println("Kadin");
			}
		} else {
			System.out.println("Bu cinsiyet tanimli degil");
		}
		scan.close();
	}

}
