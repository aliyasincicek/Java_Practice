package _09_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_03 {

    public static void main(String[] args) {
    /*
   Bir integer list oluþturunuz ve bu list’deki tum sayýlarýn karesinin
   toplamýný bulunuz. Sonucu ekrana yazdýrýnýz.
    */
    	List<String>list=new ArrayList<>();
    	Scanner scan = new Scanner(System.in);
    	
    	 System.out.println("liste atamak için sayi giriniz: ");
         System.out.println("yeterli sayiya ulastiginizda 'q' giriniz ");
         int toplam=0;
         String islem="";
         while (!islem.equalsIgnoreCase("q")) {
             System.out.println("sayi giriniz : ");
             islem = scan.next();
             list.add(islem);
		}
         list.remove(list.size()-1);
         
         for (String w : list) {
        	 int a=Integer.valueOf(w); // Integer.parseInt(w); bu da kullanýlabilir
        	 
        	 toplam+=a*a;
        	 
			
		}
         System.out.println("girilen sayilarin kareleri toplami :" + toplam);
    	
    	
    	
    	
         scan.close();
    	
    	}
}