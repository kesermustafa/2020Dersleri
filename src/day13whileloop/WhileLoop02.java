package day13whileloop;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi aliniz bu sayi icin carpim tablosunu olustgurub=nuz.
		//kullanici 13 versin.
		
		// 13x1=13    13x2=26  13x3=39 ..... 

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Carpim taplosu icin bir sayi giriniz.");
		int s = scan.nextInt();
		
		
		int i = 1;
		while (i<=10) {
			
			System.out.println(s + "x" + i + "=" + s*i);
			i++;
		}
		
		scan.close();
	}

}
