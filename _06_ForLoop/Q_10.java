package _06_ForLoop;

import java.util.Scanner;

public class Q_10 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*Kullan�c�dan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf oldu�unu,
	    de�ilse sessiz harf oldu�unu ekrana yazd�rs�n. Girdi�i de�er harf de�ilse yada
	            1 karakterden fazla ise hata mesaj� g�stersin. (Test girilen harfi b�y�k yada k���kl���ne duyarl�d�r.)
	    Sesli harfler: a,e,i,o,u
	    Test Data:
	    a
	    Beklenen ��kt�:
	    a harfi sesli harfdir.
	    Test Data:
	    d
	    Beklenen ��kt�:
	    d harfi sesiz harftir.
	    Test Data:
	    we  yada %
	    Beklenen ��kt�:
	    Yanlis karakter girdiniz!
	     */
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String harf=scan.nextLine();
        
        String sesli="ae�ou";
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
