package _07_While_DoWhile;

import java.util.Scanner;

public class Q_03_usluSayi {

	public static void main(String[] args) {
		// Kullanicidan 2 sayi alaliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan code create edinim.
        // 3, 3  sonuc = 27

        //2  3 = 2*2*2=8
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen taban ve us giriniz");
       
        int taban=scan.nextInt();
        int us=scan.nextInt();
        
        usluKuvvet(taban, us);

scan.close();
	}

	private static void usluKuvvet(int taban, int us) {
		
		int sonuc=1;
		while (us!=0) {
			sonuc*=taban;
			us--;
		}
		System.out.println("islemin sonucu :"+sonuc);
	}

}
