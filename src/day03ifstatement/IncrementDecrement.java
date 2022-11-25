package day03ifstatement;

class IncrementDecrement {

	public static void main(String[] args) {
		/*
		 Increment bir variable'in  değerini toplama veya çarpma kullanarak artrmaya denir. 
		 		 
		 */
		
		int i1 = 12;
		System.out.println(i1); // 12 
		
		//1.yol : 
		i1 = i1 + 5;
		System.out.println(i1);  // 17 
				// i1 in degerini 8 artır
		i1 = i1 + 8;
		System.out.println(i1); // 25 
		
		//2.YOL 
		i1 += 10; // 35
		System.out.println(i1);
		
		i1 += 5;
		System.out.println(i1);
		
		// 3.YOL sadece 1 artırmak istediğimizde kullanılır.
		i1 ++;
		System.out.println(i1);
		
		int i2 = 3;
		i2 = i2 * 4;
		System.out.println(i2);
		i2 *= 2;
		System.out.println(i2);
				
		/*
		 Decrement : bir variable degerini cıkarma cdya bolme ile azaltmak dekektir.
		 
		 */
		
		int k = 12;
		System.out.println(k); // 12 
		k = k - 3;
		System.out.println(k); // 9 
		k -= 5;
		System.out.println(k); // 4 
		k --;
		System.out.println(k); // 3
		
		
		int m = 12; 
		System.out.println(m); // 12 
		
		m = m / 2; // 6
		System.out.println(m); // 6 
		
		m /= 2;
		System.out.println(m); // 3 
		
	}

}
