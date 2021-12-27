package _24_Map;

import java.util.HashMap;
import java.util.Scanner;

public class C07_NestedMapExa {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		HashMap<Integer, HashMap <String, String>> ogrenciListesi=new HashMap<>();
		HashMap <String, String > ogrenciBilgileri=new HashMap<>();
		String secim="";
		do {
		System.out.println("Ogrenci adi ve soyadini giriniz");
		ogrenciBilgileri.put("Ad-Soyad", scan.nextLine());
		
		System.out.println("Ogrenci numarasini giriniz");
		ogrenciBilgileri.put("Numara", scan.next());
		
		System.out.println("Ogrenci sinifini giriniz");
		ogrenciBilgileri.put("Sinif", scan.next());
		
		System.out.println("Ogrenci kimlik no  giriniz");
		ogrenciListesi.put(scan.nextInt(), ogrenciBilgileri);
		scan.nextLine();
		System.out.println(ogrenciBilgileri);
		System.out.println(ogrenciListesi);
		
		System.out.println("DEVAM ETMEK ÝSTÝYOR MUSUNUZ? EVET/HAYIR");
		secim=scan.next();
			
		} while (secim.equalsIgnoreCase("EVET"));
		
		System.out.println("goruntulemek istediginiz ogrencinin kimlik no sunu yaziniz");
		System.out.println(ogrenciListesi.get(scan.nextInt()));
		
		
		
		
		
		
		

	}

}
