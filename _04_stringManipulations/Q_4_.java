package _05_stringManipulations;

import java.util.Scanner;

public class Q_4_ {

	public static void main(String[] args) {
		// // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen bir kelime giriniz");
		 String kelime=scan.nextLine();
		 
		 if (kelime.length()!=4) {
			 System.out.println("agam kelime 4 harf olacak");
			
		} else {
			System.out.print(kelime.substring(3));
			System.out.print(kelime.substring(2,3));
			System.out.print(kelime.substring(1,2));
			System.out.print(kelime.substring(0,1));
			
			scan.close();
			
		}
		 
		 

	}

}
