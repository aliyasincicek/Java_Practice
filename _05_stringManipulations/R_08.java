package _04_stringManipulations;

import java.util.Scanner;

public class R_08 {

	public static void main(String[] args) {
		/* Kullan�c�dan bir isim girmesini isteyin ve son 2 harfinin 3 kopyas�ndan olu�an yeni bir String yazd�r�n

        Kullanicidan alinan isim uzunlu�u en az 2 olacakt�r.

       INPUT : Mustafa

        OUTPUT : fafafa
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir isim yaziniz");
		String isim=scan.nextLine();
		System.out.println(isim.substring(isim.length()-2, isim.length())
				+ isim.substring(isim.length()-2, isim.length())
		        +isim.substring(isim.length()-2, isim.length()) );
		scan.close();
		

	}

}
