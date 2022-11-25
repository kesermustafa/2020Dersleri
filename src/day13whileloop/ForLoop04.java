package day13whileloop;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		/*
		 Satir sayisini kaullanicidan alarak asagidaki gibi sekil olustur.
		 
		 			* * * * *
		 			 * * * *
		 			  * * *
		 			   * *
		 			    *  
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Olusturulacac ucgenin satir sayisini giriniz.");
		int s = scan.nextInt();

		for (int i=0 ; i<s ; i++) {
			for (int m=0 ; m<i ; m++) {
				System.out.print(" ");	
			}
			for (int k=1 ; k<=s-i ; k++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
		
		scan.close();
		
		
	}

}
