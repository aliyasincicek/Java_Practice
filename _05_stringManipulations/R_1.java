package _05_stringManipulations;

import java.util.Scanner;

public class R_1 {

	public static void main(String[] args) {
		/*Kullan�c�ya Ad�, Soyad� ve kredi kart� numaralar�n� sorarak verilen formata ceviren java kodunu yaziniz.

		Input :

		John White

		1234234534561478

		Output : Name :

		J* W**

		CCN : ** ** **** 1478

		Ilk Harfler Buyuk harf ile baslamalidir
        */
		
		Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
		String isim=scan.nextLine();
		System.out.println(isim.charAt(0)+"*");
		
		System.out.println("Lutfen soyisminizi giriniz:");
		String soyisim=scan.nextLine();
		System.out.println(soyisim.charAt(0)+"*"+"*");
		
		System.out.println("Lutfen kredi kart� numaran�z� giriniz:");
		String kkno=scan.nextLine();
	    System.out.println("**"+"  "+ "**"+ " " +"****"+ " " +kkno.substring(12, kkno.length()));
	   
	    scan.close();
		
	}
}


