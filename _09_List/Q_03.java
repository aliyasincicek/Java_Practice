package _09_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_03 {

    public static void main(String[] args) {
    /*
   Bir integer list olu�turunuz ve bu list�deki tum say�lar�n karesinin
   toplam�n� bulunuz. Sonucu ekrana yazd�r�n�z.
    */
    	List<String>list=new ArrayList<>();
    	Scanner scan = new Scanner(System.in);
    	
    	 System.out.println("liste atamak i�in sayi giriniz: ");
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
        	 int a=Integer.valueOf(w); // Integer.parseInt(w); bu da kullan�labilir
        	 
        	 toplam+=a*a;
        	 
			
		}
         System.out.println("girilen sayilarin kareleri toplami :" + toplam);
    	
    	
    	
    	
         scan.close();
    	
    	}
}