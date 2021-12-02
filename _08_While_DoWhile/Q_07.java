package _07_While_DoWhile;

import java.util.Scanner;

public class Q_07 {

	public static void main(String[] args) {
		 // Kullanýcýda x  girilene kadar ekrana "Program çalýþýyor" yazan
        // ve x girildiðinde ise "Program bitti" yazan programý yazýnýz.
        
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz. x  girilene kadar  Program çalýþacak ve x girildiðinde ise Program bitecek");
        String str ="";


        do {
        	str=scan.nextLine(); // kullanýcýnýn verisini do nun dýsýnda alýrsak sonsuz loop a giriyor 
            if (str.equalsIgnoreCase("x")) break; // break : döngü kýrýyor

            System.out.println("Program çalýþýyor");
        } while (!str.equalsIgnoreCase("x"));

        System.out.println("Program bitti.");
	scan.close();
	}

}
