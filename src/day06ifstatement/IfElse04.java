package day06ifstatement;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {
		// Deneme
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yasinizi girirniz.");
		int a = scan.nextInt();

			if(a>55){
				System.out.println("55'den buyuk, Emekli olabilir.");
			}else {
				System.out.println("55'den kucuk, Emekli olamaz.");
			}
					
			scan.close();
	}

}
