package day17constructorsstatickeyword;

public class StaticKeyWord02 {

	public static void main(String[] args) {
		
		//Static olanlara sadece class ismi kullanarak ulasabilirsiniz.
		
		System.out.println(StaticKeyWord01.gender);
		System.out.println(StaticKeyWord01.k);
		
		//Instance olanlara ulasmak icin object uretmekzorundayiz.
		StaticKeyWord01 obj1 = new StaticKeyWord01();
		
		//Static olanlara object ulasabiliriz ama tavsiye edilmez.
		System.out.println(obj1.i);
		System.out.println(obj1.name);
		
		

	}

}
