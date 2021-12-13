package _09_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_04_OgrNot {

	public static void main(String[] args) {
		/*
         *   // Bir öðretmenden girmek istediði kadar notu alýnýz, ve
        // ortalamayý geçen öðrenci sayýsýný bulunuz.
         */
		List<Integer>listnotlar=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		String ok;
		
		do {
			System.out.println("Girmek istediginiz notu yaziniz.");
			int not=scan.nextInt();
			System.out.println("Devam etmek istiyorsaniz '+' , istemiyorsaniz '-' basin)");
			ok=scan.next();
			listnotlar.add(not);
					
		} while (ok.equals("+"));
		
		 //ortalama hesaplanmasi..
		
		int toplam=0;
		for (int i = 0; i < listnotlar.size(); i++) {
			toplam+=listnotlar.get(i);
		}
		double notOrt=toplam/listnotlar.size();
		
		//ortlamayi geçen ogrenci sayisi
		
		int gecenOgr=0;
		for (int i = 0; i < listnotlar.size(); i++) {
			if (listnotlar.get(i)>notOrt) {
				gecenOgr++;
				
			
			}
			
		}
		
		System.out.println("girilen notlarin ortalamasi  :" + notOrt);
        System.out.println("ortalama gecen ogr sayisi : " + gecenOgr);
		
		
		scan.close();	
		}
		

	}


