package _03_ifTernarySwitch_Rep;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    	Scanner scan=new Scanner(System.in);
		
		System.out.print("lutfen  sayi giriniz : ");
		int sayi=scan.nextInt();
		
		 String sonuc = (sayi>=0) ? ( (sayi<10) ? ("rakam"):("pozitif sayi")) : ("negatif sayi" ); 
		 
		 System.out.println(sonuc);
		 // if li cozum
		 
		 if (sayi>=0) {
				if (sayi<10) {
					System.out.println("rakam");
				}else {
					System.out.println("pozitif sayi");
				}
				
			}else {System.out.println("Negatif Sayi");
				
			}
	
	scan.close();
	}

}
