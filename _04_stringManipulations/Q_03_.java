package _04_stringManipulations;

import java.util.Scanner;

public class Q_03_ {

	public static void main(String[] args) {
		// Kullan�c�dan, 3 kelimeden olu�an ismi
        // �rn. Ahmet Emin Y�lmaz -> AEY format�yla yazd�r�n�z.
		
		    Scanner oku = new Scanner(System.in);
	        System.out.print("L�tfen Ad�n�z� ve soyad�n�z� giriniz = "); //Ahmet Emin Yilmaz
	        String adAd2Soyad = oku.nextLine();


	        /*Ahmet Emin Y�lmaz
	         A : adAd2Soyad.CharAt(0);
	         E : 1.bo�luk karakterinin indexinin 1 fazlas�
	         Y : Son bo�lu�un indexinin 1 fazlas� */

	        //en k�sa kod:
	        System.out.println(adAd2Soyad.charAt(0) + "." + adAd2Soyad.charAt(adAd2Soyad.indexOf(" ") + 1) + "." + adAd2Soyad.charAt(adAd2Soyad.lastIndexOf(" ") + 1) + ".");
	        //A.E.Y.

	        //1. y�ntem:
	        char adIlkHarf = adAd2Soyad.charAt(0);
	        char ad2IlkHarf = adAd2Soyad.charAt(adAd2Soyad.indexOf(" ") + 1);
	        char soyadIlkHarf = adAd2Soyad.charAt(adAd2Soyad.lastIndexOf(" ") + 1);

	        // 2.Y�ntem:
	        int ilkBoslukIndex = adAd2Soyad.indexOf(" ");
	        int sonBoslukIndex = adAd2Soyad.lastIndexOf(" ");

	        ad2IlkHarf = adAd2Soyad.charAt(ilkBoslukIndex + 1);
	        soyadIlkHarf = adAd2Soyad.charAt(sonBoslukIndex + 1);
	        /*****************************************************/
	        System.out.println(adIlkHarf + "." + ad2IlkHarf + "." + soyadIlkHarf + ".");

	        /*
	        // Kullan�c�dan alaca��n�z, 4 kelimeden olu�an ismi
	        // �rn. Ahmet Emin Y�lmaz G�l -> A.E.Y.G. format�yla yazd�r�n�z.
	        char ilkHarf = adSoyad.toUpperCase().charAt(0);
	        char ikinciHarf = adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ") + 1);
	        char ucuncuHarf = adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ", adSoyad.indexOf(" ") + 1) + 1); /
	        char dorduncuHarf = adSoyad.toUpperCase().charAt(adSoyad.lastIndexOf(" ") + 1);
	        System.out.println(ilkHarf + "." + ikinciHarf + "." + ucuncuHarf + "." + dorduncuHarf);
	        scan.close();
	         */
		 
		 // (" ", adSoyad.indexOf(" ") + 1) /ilk bo�luktan sonraki ilk harften sonraki bo�luk
		 
	oku.close();
	
		 
	}

}
