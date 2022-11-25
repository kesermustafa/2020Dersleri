package day20multidimensonalarraysarraylists;

import java.util.Arrays;

public class MultiDimensonalArrays {

	public static void main(String[] args) {
		/*
		 
		 */

		int ma[][] = { {11,5}, {7,11}, {21, 17, 28}, {10,10}  };	
		
		System.out.println(Arrays.deepToString(ma));  // [[11, 5], [7], [21, 17, 28]]
		
		System.out.println(Arrays.toString(ma[2])); // [21, 17, 28]
				
		System.out.println(ma[2][1]);  // 17
		
		//ma multi dimensonal arrayínin tum elemanlarini aralarina bosluk birakarak yazdiriniz.
		
		for (int i=0; i<ma.length; i++) {
			
			for(int k=0; k<ma[i].length; k++) {
				System.out.print(ma[i][k] + " ");
			}
		}
		
		System.out.println();
		// ma multi dimensonal arrayínin tum elemanlarinin toplamini ekrana yazdiran programi yazdirin.
		
		int sum = 0;
		
		for (int i=0; i<ma.length; i++) {
			
			for(int k=0; k<ma[i].length; k++) {
				sum = sum + ma[i][k];
			}
		}
		System.out.println("Toplam: " + sum);
		
		
		// ma multi dimensonal arrayínin tum elemanlarindan cift olanlarinin karesini ekrana yazdirin.
		
				
		for (int i=0; i<ma.length; i++) {
			
			for(int k=0; k<ma[i].length; k++) {
				if(ma[i][k]%2==0) {
					System.out.println((ma[i][k])*(ma[i][k]));
				}
			}
		}
	} 
}
