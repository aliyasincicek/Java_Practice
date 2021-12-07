package _08_Arrays;

import java.util.Arrays;

public class Q_16_stringSayiya {

	public static void main(String[] args) {
		/*
        Write a method which accepts  string as parameter and prints the sum of digits
        Parametre olarak string kabul eden ve rakamlar�n toplam�n� yazan bir metot yaz�n�z.
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
		String str="ade1r4d3";
		String arr[]=str.split("");
		  System.out.println(Arrays.toString(arr)); 
		int toplam=0;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i].charAt(0))) { // Dizedeki bir karakterin rakam m� kontrol etme.
				toplam+=Integer.valueOf(arr[i]); // String de�erini int de�erine d�n��t�rmek i�in kullan�l�r
				
			}
			
		} System.out.println("string ifadenin sayi degerleri toplami : "+toplam);
	}

}
