package day13whileloop;

import java.util.Scanner;

public class ForLoop03Tekrar {

	public static void main(String[] args) {
		
		/*
	        *
	       * *
	      * * *
	     * * * *
	    * * * * *
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Olusturulacac ucgenin satir sayisini giriniz.");
		int s = scan.nextInt();

		for (int i=1 ; i<=s ; i++) {
			
			for (int k=s-1 ; k>=i ; k--) {
				System.out.print(" ");
			}
			for (int m=1 ; m<=i ; m++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for (int i=1 ; i<s ; i++) {
			for (int n=0 ; n<i ; n++) {
				System.out.print(" ");	
			}
			for (int z=1 ; z<=s-i ; z++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
		scan.close();
	}

}
