package _07_ForLoop;

import java.util.Scanner;

public class Q_04 {

	     public static void main(String[] args) {
		// Kullan�c�dan 5 adet say� isteyiniz
        // Bu say�lardan 5 ile 10 aras�ndakiler hari�, di�erlerinin toplam�n� bulunuz.
        // bu soruyu continue kullanarak ��z�n�z.
		
		
	    Scanner scan = new Scanner(System.in);
	         
	     int toplam=0;
	     
	     for (int i = 1; i <= 5; i++) {
			
		System.out.println("Bir sayi giriniz");
	         int sayi=scan.nextInt();
	         
	         if (sayi>5 && sayi<10) {
	        	 System.out.println("girdi�iniz say� 5 ile 10 aras� oldu�undan isleme girmeyecek");
	                continue;
				
			}  
			toplam+=sayi;
	       }
	     
	     System.out.println("girdiginiz sayilarin toplam� :" + toplam);
	       
	     
	     
	   scan.close();
	     
	     }

}
