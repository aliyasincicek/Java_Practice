package _24_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C02_Map {

	public static void main(String[] args) {
		/*
		 * Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
        map➔ { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
      Istenen dil ➔ java
       Sonuc ➔ [Ali, Veli]
		 */
   Map<Integer, String> map1=new HashMap<>();
   map1.put(101,"Ali, Can, java" );
   map1.put(102,"Veli, Can, java" );
   map1.put(103,"Ali, Yan, C#" );
   String istenenDil="JAVA";
 
   System.out.println(javaBilenler(map1,istenenDil));
  
	}

	private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
		List<String> isimListesi=new ArrayList<>();
		// isimListesi ==> 
				// bu uc elemani tek tek ele alip split ile bolup
				// dil degeri verilen input'a esit olanlarin
				// isim degerlerini dilBilenListesi'ne ekleyecegim
		for (String each : map1.values()) { // key leri devre dışı bıraktık. value leri aldık. eleman sayisi 3  [Ali, Can, java, Veli, Yan, java, Ali, Yan, C#]
											// bu uc elemani tek tek ele alip split ile bolup
												// dil degeri verilen input'a esit olanlarin
												// isim degerlerini isimListesine ekleyecegim
			String arr[]=each.split(", "); // [Ali, Can, java] seklinde 3 elemanli bir array getirecek
		if (arr[2].equalsIgnoreCase(istenenDil)) { // arr [2] javanın indeksini veriyor. eger eşitse 
			isimListesi.add(arr[0]); // sıfırıncı indeksteki ismi getiriyor
		} 	
		}

		return isimListesi;
	
	}

}
