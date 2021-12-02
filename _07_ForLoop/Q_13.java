package _06_ForLoop;

import java.util.Scanner;

public class Q_13 {

	public static void main(String[] args) {
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cumle=scan.nextLine();
       
        System.out.println("bir harf giriniz");
        char harf=scan.next().toLowerCase().charAt(0);
        scan.close();
        int count=0;
        for (int i = 0; i <= cumle.length()-1; i++) {
			if (cumle.charAt(i)==harf) {
				count++;
			} 
		}System.out.println("Girdiginiz cumlede "+(harf)+  " harfi "+ (count)+ " kere kullanilmis.");
	
	
	
	
	}

}
