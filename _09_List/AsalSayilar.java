package _09_List;

import java.util.ArrayList;
import java.util.List;

public class AsalSayilar {

	public static void main(String[] args) {
		/*
	    100 den kucuk asal sayilari yazdiran bir program yaziniz
	     */
		List<Integer> asalSayilar=new ArrayList<>();
		int sayi=6;
		int sayac=0;
		while (sayi<100) {
			for (int i = 2; i <=sayi; i++) {
				if (sayi%i==0) {
					sayac++;
				}
			}
			if (sayac==1) {
				asalSayilar.add(sayi);
				
			}
			sayac=0;
			sayi++;
			
		}
		System.out.println(asalSayilar);
        System.out.println("100'e kadar olan asal sayilar ");
	}

}
