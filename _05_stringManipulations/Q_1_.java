package _05_stringManipulations;

import java.util.Scanner;

public class Q_1_ {

	public static void main(String[] args) {
 // Kullan�c�dan alaca��n� bir stringde bo�luk karakterinin olup olmad���n� kontrol ediniz.
        

        // Kullan�c�dan alaca��n� bir stringin bos olup olmad���n� kontrol ediniz.
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen bir cumle  giriniz");
		 String cumle=scan.nextLine();
		
		// boolean son= cumle.contains(" "); �eklinde yazilip syso da son yazd�r�labilir
		 // yada cumle.contains(" "); i deger atamadan da yazd�rabiliriz.. System.out.println("bosluk varmi? :" + cumle.contains(" ") );>> true ya da false �eklinde de olur
		 
		 if (cumle.contains(" ")== true) {
			 System.out.println("bosluk vard�r agam");
			
		} else {
			System.out.println("bosl�k yokd�r agam");
			}

		boolean result=cumle.isEmpty();
		
		System.out.println("yaz�lan bos midir agam :" + result);
		
		scan.close();
	}

}
