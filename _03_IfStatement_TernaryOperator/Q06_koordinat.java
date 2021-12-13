package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06_koordinat {
    public static void main(String[] args) {
        /* Kullanicidan aldiginiz koordinat noktasinin hangi bolgede oldugunu yazdiran bir kod yaziniz.
         x > 0 , y > 0 olan A(x,y) noktalarý I. bölgede, 
         x < 0, y > 0 olan B(x,y) noktalarý II. bölgede 
         x < 0, y < 0 olan C(x,y) noktalarý III. Bölgede 
         x > 0 , y < 0 olan D(x,y) noktalarý IV. bölgede bulunur.
         */
        
    	Scanner input = new Scanner(System.in);
        double x,y;
        System.out.print("Birinci noktayi giriniz (x) => ");
        x = input.nextDouble();
        System.out.print("Ýkinci noktayi giriniz (y) => ");
        y = input.nextDouble();
        koordinat( x , y);
        input.close(); 
    }
    private static void koordinat(double x, double y) {
		if ( x > 0 && y > 0) {
			System.out.println("koordinat düzleminde 1. bolge");
		} 
		if ( x < 0 && y > 0) {
			System.out.println("koordinat düzleminde 2. bolge");
		} 
		if ( x < 0 && y < 0) {
			System.out.println("koordinat düzleminde 3. bolge");
		} 
		if ( x > 0 && y < 0) {
			System.out.println("koordinat düzleminde 4. bolge");
		} 	
	}

    }

