package _05_methodCreation;

import java.util.Scanner;

public class Q_07_terstenYazdirma {

	public static void main(String[] args) {
		 /*
        reverseString isminde bir method oluşturun.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten yazsın.
        Terste yazılmış halini yazdırınız.
        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Cumle giriniz: ");
        String str = scanner.nextLine();
        
        
        System.out.println(reverseString (str));
       
	}

	private static String reverseString(String stn) {
		String conte="";
	     for (int i = stn.length()-1; i >=0 ; i--) {
	    	 conte+=stn.charAt(i);
			
		} 
		return conte; 
		
	}

}
