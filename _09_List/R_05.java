package _09_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R_05 {

	public static void main(String[] args) {
		/*Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers 
		 * if they are even or not in a return method.

				Input : 5
				Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
				Girdi olarak bir tamsayý kabul eden ve girdiden büyük ilk 10 asal sayýyý ekrana yazdýran bir program yazýnýz.
				Giriþ : 5
				Çýktý : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		 * 
		 */
		Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tamsayý giriniz : ");
        int sayi = scan.nextInt();
        
        List<Integer> asalSayilar=new ArrayList<>();
        
        
        int sayac=0;
        int sinir=0;
        while (sinir<=10) {
			
        for (int i =2 ; i <=sayi; i++) {
			if ((sayi)%i==0) {
				sayac++;	
			}
		}
        if (sayac==1) {
			asalSayilar.add(sayi);
			sinir++;
		}
        sayac=0;
        sayi++;
        } 
         System.out.println(asalSayilar);
         asalSayilar.remove(0);
         System.out.println(asalSayilar);

		
     scan.close();   
        
	}
}
