package _06_ForLoop;

import java.util.Scanner;

public class Q_12 {

	public static void main(String[] args) {
		 /*  Kullanýcýdan 1'den büyük bir tam sayý girmesini isteyin
        ve 1'den girilen tam sayýya kadar olan sayýlarýn karelerinin toplamýný
        hesaplayan kodu yazýnýz.
        Örnek Ekran Çýktýsý
       Girilen sayý=4
       Kareler toplamý=30
    */
		Scanner scan = new Scanner(System.in);
        System.out.println("1'den büyük bir tam sayý giriniz");
        int x=scan.nextInt();
        scan.close();
       int toplam =0;
        for (int i = 1; i <= x; i++) {
        	toplam+=(i*i);
     
		} System.out.println("1'den girdiginiz sayiya kadar kareler toplami :"+toplam);
		

	}

}
