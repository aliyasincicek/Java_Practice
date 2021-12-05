package _08_While_DoWhile;

import java.util.Scanner;

public class Q_02_do {

	public static void main(String[] args) {
		// indexi tek sayi olan karakterleri yazdiran bir code create ediniz
		     Scanner scan = new Scanner(System.in);
	        System.out.println("bir kelime giriniz");
	        String kelime=scan.nextLine();
		int index=0;
		do {
			if (index%2==1) {
				System.out.println(kelime.charAt(index)+ " ");
				
			}index++;
		} while (index<kelime.length());
		
		scan.close();
	}

}
