package day02wrapperclass;

public class Wrapper01 {

	public static void main(String[] args) {
	
	//byte, short ve int'in maximum ve minimum degerlri bulunuz.
		
		byte maxByte = Byte.MAX_VALUE;
		System.out.println(maxByte);
		
		byte minByte = Byte.MIN_VALUE;
		System.out.println(minByte);
		
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		
		System.out.println(maxShort);
		System.out.println(minShort);
		
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		
		float maxFloat = Float.MAX_VALUE;
		float minFloat = Float.MIN_VALUE;
		
		double maxDouble = Double.MAX_VALUE;
		double minDouble = Double.MIN_NORMAL;
		char maxChar = Character.MAX_VALUE;
		System.out.println(maxChar);
		System.out.println(maxInt);
		System.out.println(minInt);
		System.out.println(maxLong);
		System.out.println(minLong);
		System.out.println(maxFloat);
		System.out.println(minFloat);
		System.out.println(maxDouble);
		System.out.println(minDouble);	
		
		
		String name = "Ali Can";
		name.toUpperCase();
		System.out.println(name.toUpperCase());
		name.toLowerCase();
		
				
		float inc = 2.54f;
		double d1 = 2.54;
		
				
		System.out.println(inc+d1);
		
		
	}

}
