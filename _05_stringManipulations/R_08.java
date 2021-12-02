package _04_stringManipulations;

import java.util.Scanner;

public class R_08 {

	public static void main(String[] args) {
		/* Kullanýcýdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasýndan oluþan yeni bir String yazdýrýn

        Kullanicidan alinan isim uzunluðu en az 2 olacaktýr.

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
