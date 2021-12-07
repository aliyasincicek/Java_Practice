package _07_While_DoWhile;

import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {
		  /*verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
         Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
         153 = (1*1*1) + (5*5*5) + (3*3*3) gibi */
        
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Armstrong oldugunu kontrol edeceginiz tamsayiyi yaziniz");
        int sayi = scan.nextInt();
        
        
        int ilkHali=sayi;
        int kuplerToplami=0;
        int rakam=0;
        while (sayi!=0) {
			rakam=sayi%10;
			kuplerToplami+=rakam*rakam*rakam;
			sayi/=10;
		}
        if (ilkHali==kuplerToplami) {
			System.out.println("Armstrong sayi");
        
		} else {
			System.out.println("Armstrong sayi degil");

		}
        
        
     scan.close();   
	}

}
