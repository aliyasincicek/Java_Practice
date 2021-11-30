package _07_ForLoop;

import java.util.Scanner;

public class Q_07_nested {

	public static void main(String[] args) {
		 /*  Problem Tanýmý
        Matrisin boyutunu kullanýcýdan okuyup.
        Sadece diyagonu (köþegeni) 1 olan ve
        diðer elemanlarý 0 olan bir kare matrisi ekrana bastýrýn.
       Ekran Çýktýsý
        Bir sayý giriniz: 7
        1000000
        0100000
        0010000
        0001000
        0000100
        0000010
        0000001
        Bir sayi giriniz: 5
        10000
        01000
        00100
        00010
        00001
   */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		scan.close();
		for (int satir = 1; satir < sayi; satir++) {
			for (int sutun = 1; sutun < sayi; sutun++) {
				if (satir==sutun) {
					System.out.print("1");
					
				} else {
					System.out.print("0");

				}
			}
			System.out.println();
		}
		
		
		
		
	}

}
