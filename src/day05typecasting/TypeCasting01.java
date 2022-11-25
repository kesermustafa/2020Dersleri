package day05typecasting;

public class TypeCasting01 {

	public static void main(String[] args) {
		/*
		      "Auto Widening Catting"
		      
		 byte < short < int < long < float < double 
		 
		 Kucuk data type lari  buyuk data type larina cevirmek kolay bir is oldugundan 
		 Java bu isi bizim yardimimiza ihtiyac duymadan otomatik olarak yapar.
		 Ismi "Auto Widening Catting" dir.
		 */
		byte b1 = 12;
		short s1 = b1;
		int i1 = b1;
		float f1 = b1;
		
			/*
			     "Explicit Narrowing Casting (acikca daraltma islemi) "
			 byte < short < int < long < float < double 
			 
			 Buyuk data type'ni kucuk data type'ne cevirmeyi Java ototmatik yapmaz.
			 Bu cevirmeyi biz asagidaki gibi kod yazarak yapari.
			 bunun ismi "Explicit Narrowing Casting (acikca daraltma islemi) "
			 */
		short s2 = 121;
		byte b2 = (byte)s2;
		
		System.out.println(b1+s1+i1+f1);
		System.out.println(s2+b2);
	}

}
