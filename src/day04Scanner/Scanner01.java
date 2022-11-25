package day04Scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		//Kullanıcıdan data almak içinİ
		//1.Step : Scanner class'ından object ürettik.
		
		Scanner scan = new Scanner(System.in);
	
		//2.Step
		System.out.println("Yasiniza girirniz");
		
		//3. step : Kullanıcının verdiği datayı saklamak içim bir variable oluşturun. 
	
		int age = scan.nextInt();
		 
		System.out.println(age);
		
		System.out.println("isminiz");
		
		String ad = scan.next();
		
		System.out.println(ad);
		
		System.out.println("mesleginiz");
		
		String meslek = scan.next();
		
		System.out.println(meslek);
		
		scan.close();
		
	}

}
