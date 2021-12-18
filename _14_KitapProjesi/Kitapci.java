package _14_KitapProjesi;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	1.	Kullanýcýnýn Kitap ekleme, silme ve listeleme gibi
		iþlemleri yapmasýna imkan tanýyan bir uygulama yazýnýz.
	2.	Program, kitaplara 1001’den baþlayarak sýralý ve otomatik numara vermeli.
		Bunun yanýnda, her bir kitap için Kitap Adý, Yazar Adý, Yayýn Yýlý ve Fiyat gibi bilgiler girilebilmelidir.
	3.	Programýn baþlangýcýnda Kullanýcýya aþaðýdaki gibi bir menü sunulmalýdýr.
		Kullanýcý programý bitirene kadar iþlemlere devam edebilmelidir.
		========= KÝTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitaplarý listele
			4: Bitir
 */
public class Kitapci {
    static List<Kitap> kitapListe = new ArrayList<>();
    // static Scanner scan = new Scanner(System.in);
    // static int kitapNo = 1000;

    public static void main(String[] args) {
        KitapMethod.kitaplarEkle(kitapListe);

        Kitap manuelKitap = new Kitap();
        manuelKitap.setKitapAdi("manuel giris javaCan");
        manuelKitap.setNo(1003);
        manuelKitap.setYayinyili(2010);
        manuelKitap.setYazarAdi("hasan fidan");
        manuelKitap.setFiyat(123);

        kitapListe.add(manuelKitap);
        KitapMethod.menu(kitapListe);

    }

    // public static void menu(List<Kitap> liste) {//
    //     System.out.println("========= KÝTAP PROGRAMI =============\n1: Kitap ekle\n2: Numara ile kitap sil\n3: " +
    //             "Tum kitaplari listele\n4: Bitir");
//
    //     System.out.print("isleminizi seciniz : ");
    //     int tercih = scan.nextInt();
    //     switch (tercih) {
    //         case 1:
    //             kitapEkle(liste);
    //             break;
    //         case 2:
    //             noIleSil(liste);
    //             break;
    //         case 3:
    //             listele(liste);
    //             break;
    //         case 4:
    //             bitir();
    //             break;
    //         default:
    //             System.out.println("yanlis giris yapildi tekrar deneyiniz !!!");
    //             break;
    //     }
//
    // }
//
    // private static void listele(List<Kitap> liste) {
    //     for (Kitap k : liste) {
    //         System.out.println(k.toString());
//
    //     }
    //     menu(liste);
    // }
//
    // private static void noIleSil(List<Kitap> liste) {
    //     System.out.print("silinecek kitap nogiriniz : ");
    //     int silinecekNo = scan.nextInt();
    //     for (Kitap k : liste) {
    //         if (k.getNo() == silinecekNo) {
    //             liste.remove(k);
    //             menu(liste);
    //         }
//
    //     }
//
    //     System.out.println(silinecekNo + " ait kitap bulunamadi !!!");
    //     menu(liste);
    // }
//
    // private static void kitapEkle(List<Kitap> liste) {
    //     System.out.println("Kitap ismi giriniz : ");
    //     scan.nextLine();//dummy --> kukla Bos scan obj
    //     String kitapAdi = scan.nextLine();
    //     //scan.nextLine();//dummy --> kukla Bos scan obj
    //     System.out.println("Kitabin yazar  ismi giriniz : ");
//
    //     String yazarAdi = scan.nextLine();
    //     System.out.println("yayin yilini giriniz : ");
    //     int yayinyili = scan.nextInt();
    //     System.out.println("fiyatini giriniz : ");
    //     double fiyat = scan.nextDouble();  // burada ki fiyat kitap classýnda ki constructor'a gidecek.nasýl gidecek? ürettiðim obje onu oraya gönderecek
                                              //sonra burada ki objeye gelecek
    //     Kitap kitap = new Kitap(++kitapNo, kitapAdi, yazarAdi, yayinyili, fiyat);//kitap obj create edildi
    //     liste.add(kitap);   gelen bilgiler liste'ye eklendi.
    //     System.out.println(kitap.toString() + " eklendi  :) ");
    //     menu(liste);
    // }
//
    // private static void bitir() {
    //     System.out.println("yine bekleriz....");
    // }
//
}
