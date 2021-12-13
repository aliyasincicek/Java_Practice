package _02_Scanner;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {

    	 /*  Problem Tan�m�
        Bir i��inin i�i bitirme s�resini ve toplam i��i say�s�n� alarak, i�in bitme s�resini
        hesaplayan kodu yaz�n�z.
        �rne�in, Bir i��i bir i�i 10 g�nde yapabilmektedir.
        Buna g�re 2 i��i ayn� i�i ka� g�nde yapar?

        �rnek Ekran ��kt�s�
         Bir i��i i�i ka� g�nde bitirmektedir? 10
         Toplam ka� i��i �al��acak? 2
        ��in bitme s�resi 5 g�nd�r.
    */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir i��i i�i ka� g�nde bitirmektedir: ");
        int bir_isci_bitirme_suresi = scanner.nextInt();

        System.out.print("Toplam ka� i��i �al��acak: ");
        int isci_sayisi = scanner.nextInt();

        int coklu_bitirme_suresi = bir_isci_bitirme_suresi / isci_sayisi;
        System.out.println("��in bitme s�resi: " + coklu_bitirme_suresi);
        scanner.close();
    }
}
