package day13whileloop;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir string aliniz ve bu stringin tersini (Reverse String) ekrana yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz.");
		String s = scan.nextLine();
		
		for(int i=s.length()-1 ; i>=0 ; i--) {
			System.out.print(s.charAt(i));
		}
		scan.close();
	}
}
