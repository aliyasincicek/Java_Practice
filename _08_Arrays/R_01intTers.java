package _08_Arrays;

import java.util.Arrays;

@SuppressWarnings("unused")
public class R_01intTers {

	public static void main(String[] args) {
		// Write a return method to reverse number. Say�y� tersine �evirmek i�in bir metod yaz�n.
				// Input : 12345   Output : 54321
				
				int x[]= {1,2,3,4,5};
				
				System.out.println(tersineCevir(x));
				
			}

			private static String tersineCevir(int[] x) {
				String y=new String();
				for (int i =x.length-1 ; i >= 0 ; i--) {
					y+=x[i];
					
				}
				return y;
	}

}
