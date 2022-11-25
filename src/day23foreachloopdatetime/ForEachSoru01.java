package day23foreachloopdatetime;

public class ForEachSoru01 {

	public static void main(String[] args) {
		/*
		 Asagida verilen multidimensinol array'in elemanlarinin carpimini bulunuz.
		 */

		int arr[][] = {{2,3}, {4,10}, {5,6,7}, {10, 10}};
		int carpim = 1;
		
		for(int[] w : arr) {
			for(int t : w) {
				carpim = carpim * t;
			}
		}
		System.out.println(carpim);
		
	}

}
