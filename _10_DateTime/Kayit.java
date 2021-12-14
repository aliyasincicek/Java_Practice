package _10_DateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {
	//bu 

    List<Kullanici> kisiler = new ArrayList<>();//bos list birden cok kayýt alinacagi icin ya list ya da array yapilmali. bu list elemanlari 
    // bizim olusturdugumz kullanici classýndan almaktadir.

    public List<Kullanici> kayitAl() {  // bu method bize kullanici listi dondurecek. kullanici classýndan veri alacak.
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.print("adinizi giriniz : ");
        String isim = scan.nextLine();

        Kullanici user = new Kullanici(isim, LocalDateTime.now()); // kullanici classýndan obje urettik. user objesi girilen ismi önce kullanici classýna
        kisiler.add(user);    // bu constructor                    // goturur. kullanici classýnda da par.li constructor gider ve ismi ekler
        return kisiler;
    }

    public void sansliKull(List<Kullanici> kull) { // 11. satirdaki listten gelen verileri kullanan method
        for (Kullanici each : kull) {
            if (each.kayitZamani.getSecond() < 10) {
                System.out.println("sansli kisisiniz " + each.name + " agam 5 kilo bal kazandin");
            } else System.out.println("maalesef " + each.name + "ballar balýný buldunuz kovanýnýz yagmalandi");
        }
    }

    public void listele(List<Kullanici> kul) { // 11. satirdaki listten gelen verileri listeleyen method
        for (Kullanici each : kul) {
            System.out.println("Adi :" + each.name + " kayit zamani : " + each.kayitZamani);
        }
    }
}