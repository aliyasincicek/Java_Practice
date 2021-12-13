package _04_stringManipulations;

import java.util.Scanner;

public class Q_02 {

	public static void main(String[] args) {
		// // Kullanýcýdan tek seferde alacaðýnýz 2 kelimelik ad soyadý 2 ayrý kelimeye ayýrýnýz,
        // ad ayrý soyad ayrý sekilde ekrana yazdýrýnýz.
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen bir ad-soyad giriniz");
		 String adSoyad=scan.nextLine();
		 
		 String ad=adSoyad.substring(0, adSoyad.indexOf(" "));
		 String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1);
		 
		 
		 System.out.println("adýnýz : "+ ad+ " soyadýnýz : " + soyad);
scan.close();
	}

}
