package _04_stringManipulations;

import java.util.Scanner;

public class Q_02 {

	public static void main(String[] args) {
		// // Kullan�c�dan tek seferde alaca��n�z 2 kelimelik ad soyad� 2 ayr� kelimeye ay�r�n�z,
        // ad ayr� soyad ayr� sekilde ekrana yazd�r�n�z.
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen bir ad-soyad giriniz");
		 String adSoyad=scan.nextLine();
		 
		 String ad=adSoyad.substring(0, adSoyad.indexOf(" "));
		 String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1);
		 
		 
		 System.out.println("ad�n�z : "+ ad+ " soyad�n�z : " + soyad);
scan.close();
	}

}
