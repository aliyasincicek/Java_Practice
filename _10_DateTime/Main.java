package _10_DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String islem;

        Kayit yeniKayit = new Kayit();  // kayit classýndaki metodlari kullanmak icin obje olusturduk.
        List<Kullanici> kisi = new ArrayList<>(); // eklenecek kisiler icin list olusturduk

        boolean cikilsinMi = false;
        while (!cikilsinMi) {
            System.out.println("lutfen \n " +
                    "Kisi eklemek icin-->1" +
                    "\n Kisi listelemek icin--2\n " +
                    "sansli kisi bulmak icin-->3\n " +
                    "cikis icin-->4");
            islem = scan.next();
            switch (islem) {
                case "1":
                    kisi = yeniKayit.kayitAl();  // yeni kayit objesinin kayit al metodu calýþir. kisi ye assign eder
                    break;
                case "2":
                    yeniKayit.listele(kisi);
                    break;
                case "3":
                    yeniKayit.sansliKull(kisi);
                    break;
                case "4":
                    cikilsinMi = true;
                    break;
                default:
                    System.out.println("hatali veri girdiniz");
                    break;

            }
        }
    }
}
