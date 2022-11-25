package day11stringmethods;

import java.util.Scanner;

public class String04 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir string alin
		 tum rakamlari * yapin
		 Bas ve sondaki tum spaceleri silin
		 Aralardaki space leri ! yapin
		 a ve Z haflerini buyuk yapin
		 en basa "("  ve en sona ")"  koyun....
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cumle giriniz.");
		String c = scan.nextLine();
		
		
		c = c.trim();
		c = c.replaceAll("\\d" , "*");
		c = c.replaceAll("\\s" , "!");
		
		c = c.toLowerCase();
		c = c.replace("a" , "A");
		c = c.replace("z" , "Z");
			System.out.println("(".concat(c).concat(")"));
		scan.close();
	}

}
