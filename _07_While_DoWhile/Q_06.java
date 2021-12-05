package _07_While_DoWhile;

import java.util.Scanner;

public class Q_06 {

	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
	   //kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("bolunen sayiyi giriniz  : ");
		int bolunen = scan.nextInt();
		System.out.print("bolen sayiyi giriniz  : ");
		int bolen = scan.nextInt();
		
		bol( bolunen, bolen);
		System.out.println("yaptiginiz islemin sonucu :"+ bol( bolunen, bolen));
		scan.close();
	}

	private static int bol(int bolunen, int bolen) {
		int bolum=0;
		while (bolunen>=bolen) {
			bolunen-=bolen;
			bolum++;
			
		}
		return bolum;
		
	}

}
