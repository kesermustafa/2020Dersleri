package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ma[][] = new int [3][2];
		
		//Multidimesional array'lar nasil ekrana yazdirilir.
		System.out.println(Arrays.deepToString(ma));
		
		//Eleman ekleme nasil yapilir.
		
		ma[0][0] = 33;
		System.out.println(Arrays.deepToString(ma));
		ma[1][1] = 24; 
		System.out.println(Arrays.deepToString(ma));
		ma[0][1] = 32;
		System.out.println(Arrays.deepToString(ma));
		ma[1][0] = 23; 
		System.out.println(Arrays.deepToString(ma));
		ma[2][0] = 13;
		System.out.println(Arrays.deepToString(ma));
		ma[2][1] = 11; 
		System.out.println(Arrays.deepToString(ma)); 
		
		System.out.println(Arrays.toString(ma[1]));//[23,24]
		
		//multidimensional array lerde istenilen bir eleman nasil yazdirilir.
		
		System.out.println(ma[2][0]); // 13 
		System.out.println(ma[1][1]); // 24
		
	}

}
