package _06_ForLoop;

import java.util.Scanner;

public class R_07 {

	public static void main(String[] args) {
		/*Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n.
		Say�n�n kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, herhangi bir say� M�kemmel Say� olarak bilinir.
		Input :6
		Output:6 Mukemmel Sayidir.
	=====================
		Input:7
		Output:7 Mukemmel Sayidir degildir.
*/
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();
        int toplam=0;
        
        for (int i = 1; i < sayi; i++) {
        	if (sayi%i==0) {
        		toplam+=i;
				}
        }
       
       	if (sayi==toplam) {
        		System.out.println(toplam+ " mukemmel sayidir");
				
			} else {
				System.out.println(toplam+ " mukemmel sayi degildir");

			} 
	}

}
