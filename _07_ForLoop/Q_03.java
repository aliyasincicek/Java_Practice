package _07_ForLoop;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		 /*
        Girilen bir stringdeki a harfi sayýsýný bulunuz.
        ama  c harfine  gelirse döngüden çýkýlsýn

        Bugün hava oldukca güzel.-> 2
         

         */
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle=scan.nextLine();
        int toplam=0;
        for (int i = 0; i < cumle.length(); i++) {
        	
        	if (cumle.toLowerCase().charAt(i)=='a') {
        			toplam++;
			} else if(cumle.toLowerCase().charAt(i)=='c') {
				break;

			}
			
			
		} System.out.println("girdiginiz metindeki c karakterine kadar olan a karakter sayisi : "+toplam);
		scan.close();
	} 

}
