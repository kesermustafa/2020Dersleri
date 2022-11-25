package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan notu alin ve asagidaki kuralara gore A B C ve D yazdirin;
		 1. 50'den az D   2. 50(dahil) ile 60 arasi C    3. 60 (dahil) ile 80 arasi B   4. 80(dahil) ile 100(dahil)  A
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Not'u giriniz");
		int N = scan.nextInt();
		
		if (N<0) {
			System.out.println("Not gir dedik ya");
		}else if(N<50) {
			System.out.println("D");
		}else if(N<60) {
			System.out.println("C");
		}else if((N<80)){
			System.out.println("B");
		}else if(N<=100){
			System.out.println("A");
		}else {
			System.out.println("Not gir dedik ya");
		}
		scan.close();
	}

}
