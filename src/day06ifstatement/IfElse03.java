package day06ifstatement;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
		// Kullanicidan bir tam sayi alin o tam sayinin mutlak degerini ekrana yazdirin.
		// a>=0 ====> Mutlak deger = a      a<=0 Mutlak deger = -a
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi girirniz.");
		int a = scan.nextInt();

		if(a>=0) {
			System.out.println(a);
		}else {
			System.out.println(-a);
		}
		
		scan.close();
	}

}
