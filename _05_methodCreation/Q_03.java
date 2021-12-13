package _05_methodCreation;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
		
		    Scanner scan = new Scanner(System.in);
	        System.out.println("Birimi giriniz");
	        String birim=scan.nextLine();
	        System.out.println("Miktari giriniz");
	        double miktar=scan.nextDouble();
	        
	        donusturucu(birim,miktar);
		
		scan.close();
		
	}

	private static void donusturucu(String birim, double miktar) {
		
		switch (birim) {
		case "saat":
			System.out.println("girdiginiz saat :"+(miktar*60*60) +"saniyedir");
			
			break;
        case "km":
        	System.out.println("girdiginiz mil :"+(miktar*1.6) +"kmdir");
			break;
        case "kg":
        	System.out.println("girdiginiz kg :"+(miktar*1000) +"gramdir");
	
	break;

		default:
			System.out.println("yanlýs birim girdiniz");
			break;
		}
		
	}

}
