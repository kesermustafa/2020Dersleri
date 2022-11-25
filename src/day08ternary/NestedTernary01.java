package day08ternary;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir tam sayi alin
		 sayi 3 basamakli ise ekrana "3 Basamakli"
		 3 basamakli degilse "3 basamakli olmayan cift sayi"
		 Cift sayi degilse "3 basamakli olmayan tek sayi"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int s = scan.nextInt();
	
	String result = s>99 && s<1000 ? "3 Basamakli" : (s%2==0 ? "3 basamakli olmayan cift sayi" : "3 basamakli olmayan tek sayi"); 
	System.out.println(result);
	
	scan.close();
	}
}

