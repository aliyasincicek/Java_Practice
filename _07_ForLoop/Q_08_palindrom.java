package _07_ForLoop;

import java.util.Scanner;

public class Q_08_palindrom {

	public static void main(String[] args) {
		 // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String cumle = scan.nextLine();
        String terstenCmule="";
        scan.close();
        for (int i = cumle.length()-1; i >= 0; i--) {
        	terstenCmule+=cumle.charAt(i);	
		}

        if (cumle.equals(terstenCmule)) {
			System.out.println("girdiginiz cumle palindrome'dur");
		} else {
			System.out.println("girdiginiz cumle palindrome degildir");

		}
	}

}
