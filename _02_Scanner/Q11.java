package _02_Scanner;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
    	 /*
        TechProEd spor salonu i�in kullan�c�dan isim soyisim, ya�, kilo, boy, salona devam edece�i ay s�resini
        bilgilerini al�p ayl�k $20 olarak toplam �cretini yazd�r�n�z.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("TechProEd Salonu'na ho�geldiniz!");

        System.out.print("�sim Soyisim: ");
        String isim = scanner.nextLine();

        System.out.print("Ya��n�z: ");
        int yas = scanner.nextInt();

        System.out.print("Kilo: ");
        double kilo = scanner.nextDouble();

        System.out.print("Boy: ");
        double boy = scanner.nextDouble();

        System.out.print("Ka� ayl�k kaydolacaks�n�z: ");
        int aylik = scanner.nextInt();

        int aylik_ucret = 20;

        int toplam_tutar = aylik_ucret * aylik;

        System.out.print("Toplam Tutar: " + toplam_tutar + " Euro");
        scanner.close();
    }
}
