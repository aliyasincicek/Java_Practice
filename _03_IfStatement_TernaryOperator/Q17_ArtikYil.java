package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q17_ArtikYil {

	public static void main(String[] args) {
		/* artik yil sorusu
		 * Genel bir kural olarak, art�k y�llar 4 rakam�n�n kat� olan y�llard�r.
		 * Ancak bu kural�n istisnas� vard�r:
           100'�n kat� olan y�llardan sadece 400'e kalans�z olarak b�l�nebilenler art�k y�ld�r:
*/
				Scanner scan = new Scanner(System.in);
				System.out.print("L�tfen bir y�l giriniz : ");
				int year = scan.nextInt();
				System.out.println ("   ***   if c�zumu   ***   ");
				if (year % 100 == 0 && year % 400 == 0) {
					System.out.println("Girdi�iniz "+year + " y�l� ARTIK YIL");
				} else if (year % 100 != 0 && year % 4 == 0) {
					System.out.println("Girdi�iniz "+year + " y�l� ARTIK YIL");
				} else {
					System.out.println("Girdi�iniz "+year + " y�l� ARTIK YIL de�ildir.");
				}

				//  ternary cozumu ...
				System.out.println ("   ***   ternary c�zumu   ***   ");

				String result = year % 100 == 0 ? year % 400 == 0 ? "Artik Yil" : "Artik Yil Degil"
						: year % 4 == 0 ? "Artik Yil" : "Artik Yil Degil";
				System.out.println(result);
				

				scan.close();
	}

}
