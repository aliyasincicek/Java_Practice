package _24_Map;

import java.util.TreeMap;

public class C04_TreeMapMetotlar {
	public static void main(String[] args) {
		
		
		TreeMap <Integer, String> mapList=new TreeMap<>();
		mapList.put(1, "Ersin");
		mapList.put(6, "Pjanic");
		mapList.put(4, "Rosier");
		mapList.put(10, "Ghezzal");
		/*
		 * TreeMap, elemanlari natural order’a gore siralar. Siralama icin key’i dikkate alir
		 * HashMap thread-safe ve synchronized degildir. Yavaþtýr
			1) ceilingEntry(key); key map’te varsa entry’yi dondurur, key map’de yoksa olmasi gereken yerden sonraki ilk entry’yi dondurur . 
			En buyuk keyden daha buyuk deger girilirse null doner
			2) descendingKeySet(); key’leri descending order’la dondurur 
			3) firstEntry(); ilk Entry’i dondurur 
			4) floorEntry(key); girdigimiz key map’te yoksa, key’i girdigimiz sayidan kucuk olan en yakin Entry’yi dondurur
			5) headMap(key); girdigimiz key exclusive olmak uzere onceki Entry’leri bir map olarak verir 
			6) headMap(key,true); girdigimiz key inclusive olmak uzere onceki Entry’leri bir map olarak verir 
			7) tailMap(key); girdigimiz key inclusive olmak uzere sonraki Entry’leri bir map olarak verir 
			8) tailMap(key,false); girdigimiz key exclusive olmak uzere sonraki Entry’leri bir map olarak verir
		 */
		
		
	}

}
