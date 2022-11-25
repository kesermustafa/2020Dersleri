package day20multidimensonalarraysarraylists;

import java.util.Arrays;

public class OdevSorusu {

	public static void main(String[] args) {
		/*
		 Asagidki multi dimensional array'in ic array'lerde ki tum elemanlarin toplamini birer birer bulun
		 ve her bir sonucu yeni bir arrayín elemani yapan ve yeni array'i ekrana yazdiran program yapin.
		 
		 ornek ; { {1,2,3}, {4,5}, {6,7} ==> 1+2+3=6   4+5=9   6+7=13  ===> {6, 9, 13}
		 */

		int arr[][] = { {1,2,3}, {4,5}, {6,7,}, {3, 9 }}; 
		
		int sum = 0;
		
		int sonuc[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			
			for(int k=0; k<arr[i].length; k++) {
				sum = sum + arr[i][k];
			}
			sonuc[i]= sum;
			sum=0;
		}
		System.out.println(Arrays.toString(sonuc));
	}
}
