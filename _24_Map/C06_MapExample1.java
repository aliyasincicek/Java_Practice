package _24_Map;

import java.util.HashMap;
import java.util.Scanner;

public class C06_MapExample1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String secim = "";
	    HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();
	   
	    do {
	      HashMap<String, String> kisiBilgileri = new HashMap<>();

	      System.out.print("L�tfen ad�n�z� ve soyad�n�z� giriniz : ");
	      //String isim=scan.nextLine();
	      kisiBilgileri.put("Ad", scan.nextLine());

	      System.out.print("L�tfen adresinizi giriniz : ");
	      //  String adres=scan.nextLine();
	      kisiBilgileri.put("Adres", scan.nextLine());

	      System.out.print("L�tfen telefonunuzu giriniz : ");
	      //String tel=scan.nextLine();
	      kisiBilgileri.put("Telefon", scan.nextLine());

	      System.out.print("L�tfen 4 haneli kimlik no giriniz : ");
	      // int kimlikNo=scan.nextInt();
	      kisiListesi.put(scan.nextInt(), kisiBilgileri);
	      scan.nextLine();
	      System.out.println(kisiBilgileri);
	      System.out.println(kisiListesi);

	      System.out.print("Devam etmek istiyor musunuz(E/H)");
	      secim = scan.nextLine();
	    } while (secim.equalsIgnoreCase("E"));

	    System.out.print( "G�r�nt�lemek istedi�iniz ki�inin kimlik numaras�n� giriniz : ");
	    System.out.println(kisiListesi.get(scan.nextInt()));

	}

}
