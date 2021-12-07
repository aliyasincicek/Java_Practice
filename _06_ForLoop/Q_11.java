package _06_ForLoop;

import java.util.Scanner;

public class Q_11 {

	public static void main(String[] args) {
		/*bir sayinin mükemmel olup olmadiðini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamý, kendisine eþitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();
        int toplam=0;
       
        scan.close();
        for (int i = 1; i < sayi; i++) {
        	if (sayi%i==0) {
        		toplam+=i;
			}
			}
        if (toplam==sayi) {
				System.out.println("girdiginiz sayi mukemmel sayidir");
			} else {
				System.out.println("girdiginiz sayi mukemmel sayi degildir");
		}
        
		}
       
	}


