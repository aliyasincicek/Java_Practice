package _06_ForLoop;

import java.util.Scanner;

public class Q_12 {

	public static void main(String[] args) {
		 /*  Kullan�c�dan 1'den b�y�k bir tam say� girmesini isteyin
        ve 1'den girilen tam say�ya kadar olan say�lar�n karelerinin toplam�n�
        hesaplayan kodu yaz�n�z.
        �rnek Ekran ��kt�s�
       Girilen say�=4
       Kareler toplam�=30
    */
		Scanner scan = new Scanner(System.in);
        System.out.println("1'den b�y�k bir tam say� giriniz");
        int x=scan.nextInt();
        scan.close();
       int toplam =0;
        for (int i = 1; i <= x; i++) {
        	toplam+=(i*i);
     
		} System.out.println("1'den girdiginiz sayiya kadar kareler toplami :"+toplam);
		

	}

}
