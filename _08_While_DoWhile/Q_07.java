package _07_While_DoWhile;

import java.util.Scanner;

public class Q_07 {

	public static void main(String[] args) {
		 // Kullan�c�da x  girilene kadar ekrana "Program �al���yor" yazan
        // ve x girildi�inde ise "Program bitti" yazan program� yaz�n�z.
        
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz. x  girilene kadar  Program �al��acak ve x girildi�inde ise Program bitecek");
        String str ="";


        do {
        	str=scan.nextLine(); // kullan�c�n�n verisini do nun d�s�nda al�rsak sonsuz loop a giriyor 
            if (str.equalsIgnoreCase("x")) break; // break : d�ng� k�r�yor

            System.out.println("Program �al���yor");
        } while (!str.equalsIgnoreCase("x"));

        System.out.println("Program bitti.");
	scan.close();
	}

}
