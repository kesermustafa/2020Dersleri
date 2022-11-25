package day05typecasting;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		//kullanicinin girdigi 4 basamakli sayinin ilk ve son rakamlari toplami.
		Scanner scan = new Scanner(System.in);
		System.out.println("Dort basamakli bir sayi griniz");
		short s = scan.nextShort();
		
		int sonRakam = s % 10;
		int ilkRakam = s / 1000;
		System.out.println("Ilk rakam ve son Rakam Toplami:" + (ilkRakam+sonRakam));

		scan.close();
		
	
	}

}
