package _03_ifTernarySwitch_Rep;

import java.util.Scanner;

public class R_06 {

	public static void main(String[] args) {
		/*Kullan�c�dan bir isim yazmas�n� isteyin, ad�n uzunlu�u 3 olmal�d�r. Ard�ndan, ad�n ayn� karakterlere sahip olup olmad���n� kontrol edin.

		Eger ayn� karakterlere sahipse

		"isim ayni karakterlere sahiptir." yazdirin.

		Eger ayni kaakterlere sahip degilse

		"Dizenin benzersiz karakterleri var" yazdirin.

		Ternary kullanin.
		*/
 
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 kelimelik isim yaziniz");
		String isim=scan.nextLine();
        String str ="Ali Veli Gelberi";
        
      String sonuc=str.equalsIgnoreCase(isim) ?   "isim ayni karakterlere sahiptir"   :    "Dizenin benzersiz karakterleri var" ;
      System.out.println(sonuc);
	
	scan.close();
	}

}
