package _09_List;

import java.util.Scanner;

public class R_03 {

	public static void main(String[] args) {
		/*Get a sentence from the user. Accept the sentence received from the user as a parameter, 
		 * Invert sentence using Array and write a Method that returns the result as a String to the main method.
          Note: Upper and lower case letters, spaces and special characters will not be changed.
         Input :It is very nice to write code.
         Output :.edoc etirw ot ecin yrev si tI
         
         Kullanýcýdan bir cümle alýn. Kullanýcýdan alýnan cümleyi parametre olarak kabul edin, 
         Array kullanarak cümleyi ters çevirin ve sonucu ana metoda String olarak döndüren bir Method yazýn.
		Not: Büyük ve küçük harfler, boþluklar ve özel karakterler deðiþtirilmeyecektir.
		Giriþ :It is very nice to write code.
		Çýktý :.edoc etirw ot ecin yrev si tI
		*/
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Cumle giriniz : ");
        String cumle = scan.nextLine();
        String arr[]=cumle.split("");
        String container="";
        for (int i = arr.length-1; i >=0; i--) {
        	container+=arr[i];	
        	
		}
        System.out.println(container);
        scan.close();

	}

}
