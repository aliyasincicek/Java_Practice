package _05_stringManipulations;

import java.util.Scanner;

public class Q_1_ {

	public static void main(String[] args) {
 // Kullanýcýdan alacaðýný bir stringde boþluk karakterinin olup olmadýðýný kontrol ediniz.
        

        // Kullanýcýdan alacaðýný bir stringin bos olup olmadýðýný kontrol ediniz.
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen bir cumle  giriniz");
		 String cumle=scan.nextLine();
		
		// boolean son= cumle.contains(" "); þeklinde yazilip syso da son yazdýrýlabilir
		 // yada cumle.contains(" "); i deger atamadan da yazdýrabiliriz.. System.out.println("bosluk varmi? :" + cumle.contains(" ") );>> true ya da false þeklinde de olur
		 
		 if (cumle.contains(" ")== true) {
			 System.out.println("bosluk vardýr agam");
			
		} else {
			System.out.println("boslýk yokdýr agam");
			}

		boolean result=cumle.isEmpty();
		
		System.out.println("yazýlan bos midir agam :" + result);
		
		scan.close();
	}

}
