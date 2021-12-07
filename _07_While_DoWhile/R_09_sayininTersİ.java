package _07_While_DoWhile;

import java.util.Scanner;

public class R_09_sayininTersÝ {

	public static void main(String[] args) {
		/*Kullanýcýnýn girdiði sayýyý tersine çeviren bir java programý yazýnýz. (Mulakat Sorusu)

Input :1238

Output :Girilen Numananin Tersi: 8321
*/
		Scanner scan = new Scanner(System.in);
        System.out.println("Tersine cevirmek icin bir tam sayi girin...");
        String sayi = scan.next();
        String cont="";
       /* for (int i = sayi.length()-1 ; i >=0 ; i--) {
        	
        	 cont+=sayi.substring(i,i+1);
		}
       */ 
        
        int i=sayi.length()-1;
        while (i>=0) {
        	cont+=sayi.substring(i,i+1);
        	i--;
		}
        System.out.println("Girilen sayinin tersi :"+cont);
	}

}
