package _06_ForLoop;

import java.util.Scanner;

public class R_02_ebob_ekok {

	public static void main(String[] args) {
		//Kullan�c�dan 2 tamsay� girmesini ve ard�ndan GCD (En B�y�k Ortak B�len) ve LCM'yi (En K���k Ortak Kat) bulmas�n� isteyin.

		
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		System.out.print("kucuk sayiyi giriniz :");
		int sayi1=scan.nextInt();
		System.out.print("buyuk sayiyi giriniz :");
		int sayi2=scan.nextInt();
		int ebob=0;
		int ekok=0;
		int max=sayi1*sayi2;
		for (int i = 1; i < sayi1; i++) {
			if (sayi1%i==0 && sayi2%i==0) {
				ebob=i;
			}
			
		}
		for (int i = max; i > 0; i--) {
			if (i%sayi1==0 && i%sayi2==0) {
				ekok=i;	
			}
			
		}
		System.out.println("verdiginiz sayilarin ebob'u : "+ ebob + " ekok'u : " + ekok);
	}

}
