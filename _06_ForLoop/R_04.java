package _06_ForLoop;


public class R_04 {

	public static void main(String[] args) {
		/* Girdi olarak bir tamsay� kabul eden ve fakt�riyel hesaplayan programi yaz�niz.
       Input : 6
        Output: 6!=65432*1=720
*
*/
		@SuppressWarnings("unused")
		int versayi=6;
		int sayi=1;
		for (int i = 6; i >1; i--) {
			sayi*=i;
			
		}
		System.out.println(sayi);
	}

}
