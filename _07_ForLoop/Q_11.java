package _07_ForLoop;

import java.util.Scanner;

public class Q_11 {

	public static void main(String[] args) {
		/*bir sayinin m�kemmel olup olmadi�ini bulan bir method yaziniz.
        M�kemmel sayi : bir sayinin kendisi hari� b�lenlerinin toplam�, kendisine e�itse o sayi m�kemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (M�kemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;
        boolean flag=false;
       
        for (int i = 0; i < sayi; i++) {
        	if (sayi%i==0) {
				toplam+=i;
        		
			} 
			if (sayi==toplam) {
				flag= true;
			} System.out.println("mukemmel sayidir");
			}
		}
       
	}


