package _06_ForLoop;

import java.util.Scanner;

public class Q_10 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*Kullanýcýdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduðunu,
	    deðilse sessiz harf olduðunu ekrana yazdýrsýn. Girdiði deðer harf deðilse yada
	            1 karakterden fazla ise hata mesajý göstersin. (Test girilen harfi büyük yada küçüklüðüne duyarlýdýr.)
	    Sesli harfler: a,e,i,o,u
	    Test Data:
	    a
	    Beklenen Çýktý:
	    a harfi sesli harfdir.
	    Test Data:
	    d
	    Beklenen Çýktý:
	    d harfi sesiz harftir.
	    Test Data:
	    we  yada %
	    Beklenen Çýktý:
	    Yanlis karakter girdiniz!
	     */
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String harf=scan.nextLine();
        
        String sesli="aeýou";
        String sessiz="bcdfghjklmnprstyvzxwq";
        scan.close();
        if (harf.length()==1) {
        	for (int i = 0; i < sesli.length(); i++) {
        		if (sesli.contains(harf)) {
        		System.out.println("Girdiginiz harf seslidir");
				break;
			} else if (sessiz.contains(harf)) {
				System.out.println("Girdiginiz harf sessizdir");
				break;
			} else {
				System.out.println("hata...ozel karakter olmaz. harf girmelisiniz");
				break;
			}
        	}
        	
		} else {
			System.out.println("hata....harf girmelisiniz");
			

		}
	
	
	
	
	
	
	
	}

}
