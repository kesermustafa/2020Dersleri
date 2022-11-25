package day20multidimensonalarraysarraylists;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewSorusu {

	public static void main(String[] args) {
		//bir String de kullanilan tum harflerin sayisini gosteren kodu yaziniz.
		// Alacan    a=3, l=1, c=1, n=1

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz.");
		String s = scan.nextLine();

		//split()
		String ch[] = s.split("");
		System.out.println(Arrays.toString(ch));
		
		//sort()
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		
		//counter 
		int counter = 0;
		
		for(int i=1; i<ch.length; i++) {
			if(ch[i-1].equals(ch[i])) {
				counter++;
			}else {
				System.out.println(ch[i-1] + "'in sayisi:" + (counter + 1));
				counter = 0;
			}
			
			if(i==ch.length-1) {
				System.out.println(ch[i] + "'in sayisi:" + (counter + 1));
			}
		}
		
		scan.close();
		
	}

}
