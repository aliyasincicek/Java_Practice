package _05_methodCreation;

import java.util.Scanner;

public class Q_07_terstenYazdirma {

	public static void main(String[] args) {
		 /*
        reverseString isminde bir method olu�turun.
        Bu method bir String'i parametre olarak als�n.
        Ve bu method, girilen String'i tersten yazs�n.
        Terste yaz�lm�� halini yazd�r�n�z.
        �rn: String = "Java'y� Seviyorum."
        Print: .muroyiveS �y'avaJ
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
