package day06ifstatement;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		// if it rains I will go to Mall else I will go to picnic
		// Yagmur yagarsa markete gidecegim Yagmur yagmazsa piknige gidecegim. 

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi girirniz.");
		int a = scan.nextInt();
		// if-else sadece 1 d=condition icerir, ikili if ise iki tane condition icerir.\
		//Java her condition'ni kontrol etmek zorundadir, iki conditione'ni kontrol etmek
		// daha uzun zaman gerektirir ve bu da Javayi yorar.
		if(a>=0) {
			System.out.println("Negatif degil");
		}else {
			System.out.println("Negatif");
		}
		
		System.out.println("=================");
		if(a>=0) {
			System.out.println("Negatif degil");
		}
		
		if(a<=0) {
			System.out.println("Negatif");
		}
	
		scan.close();
	}

}
