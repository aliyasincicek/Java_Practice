package _07_While_DoWhile;

import java.util.Scanner;

public class R_01 {

	public static void main(String[] args) {
		/* Kullan�c�dan bir isim ve bir karakter girmesini isteyin, ard�ndan d�ng�leri kullanarak karakterin isimde ka� kez tekrarland���n� kontrol edin
char ch1= 'a' ;
	String name =�John came late" 
	Expected Output: 
    Number of a = 2
*/
		
		     @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
             System.out.println("bir isim giriniz");
             String isim=scan.nextLine();
             System.out.println("bir harf giriniz");
             char harf=scan.next().toLowerCase().charAt(0);
        
       int sayac=0;
       int x=0;
       
        while (x<=isim.length()-1) {
        	if (isim.charAt(x)==harf) {
        		sayac++;
				x++;
			
        	} 
		
	}System.out.println("Girdiginiz cumlede "+(harf)+  " harfi "+ (sayac)+ " kere kullanilmis.");
        }  
}
