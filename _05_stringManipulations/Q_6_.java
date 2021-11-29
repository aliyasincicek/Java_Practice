package _05_stringManipulations;

import java.util.Scanner;

public class Q_6_ {

	public static void main(String[] args) {
		 /*
	       kullanýcýdan bir e-posta adresi girmesini isteyin, ardýndan "hotmail" içeriyorsa, "gmail" ile deðiþtirin,
	        örneðin: johnbrown@hotmail.com ==> johnbrown@gmail.com
	        */
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen bir email hesabi giriniz");
		 String email=scan.nextLine();
		 
		 if (email.contains("@gmail.com")) {
			 System.out.println("agam e-posta ne hoþdýr");
			
		} else {
			System.out.println(email.replace("@hotmail.com", "@gmail.com"));
			scan.close();

		}

	}

}
