package day18StaticBlockarrays;

public class Test1 {

	int x = 10;
	
	
	public static void main(String[] args) {
		
	//	System.out.println(Test1.x);
	}

	static {
		int x = 20;
		System.out.println(x + " ");
	}
	
	
	
}
