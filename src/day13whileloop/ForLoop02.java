package day13whileloop;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 for loop kullanarak asagida verilen sekli olusturunuz.
		 		*
		 		**
		 		***
		 		****
		 		*****
		 */
		for (int i=1 ; i<=5	; i++) {
			
			for (int k=1 ; k<=i ; k++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		 
		System.out.println("Gorev tamam");
	}
}

