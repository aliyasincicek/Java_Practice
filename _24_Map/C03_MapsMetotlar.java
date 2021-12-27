package _24_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class C03_MapsMetotlar {

	public static void main(String[] args) {
		// put ekleme
		Map<String, Integer> exampleMap=new HashMap<>();
		exampleMap.put("Barcelona", 4);
		exampleMap.put("Real Madrid", 13);
		exampleMap.put("Milan", 7);
		exampleMap.put("Liverpool", 6);
		exampleMap.put("Bayern Munih", 6);
		
		Map<String,Integer> exampleMap2= new HashMap<>();
		exampleMap2.put("Besiktas", 16);
		exampleMap2.put("Juventus", 34);
		
		// 1) containsKey(key); istenen key degeri Map’de varsa true,  yoksa false doner .
		System.out.println(exampleMap.containsKey("Milan")); // true
		
		// 2) containsValue(value); istenen value degeri Map’de varsa true, yoksa false doner 
		System.out.println(exampleMap.containsValue(4)); // true
		
		// 3) entrySet(); Map’deki entry’leri bir Set olarak verir. Entry : Map’de her bir elemani olusturan key-value ikilisidir
		System.out.println(exampleMap.entrySet()); // [Bayern Munih=6, Liverpool=6, Milan=7, Barcelona=4, Real Madrid=13]
		
		// 4) equals(map); Map’deki tum elemanlari karsilastirir. Hepsi ayni ise true farkli olan varsa false dondurur
		System.out.println(exampleMap.equals(exampleMap2)); //false
		
		//5) get(key); istenen key degeri Map’de varsa o key’e ait  value’yu, map’de yoksa null doner
		System.out.println(exampleMap.get("Milan")); // 7
		
		//6) getOrDefault(key,defaultDeger); istenen key degeri Map’de varsa o key’e ait value’yu, key map’te yoksa default degeri doner.
		System.out.println(exampleMap.getOrDefault("Besiktas", null)); // null
		System.out.println(exampleMap.getOrDefault("Real Madrid", 7)); // 13 
		
		// 7) putAll(map); verilen map’deki tum elemanlari bizim map’imize ekler,  tekrarlanan eleman varsa uzerine yazar
		
		// 8) compute(key, (key,value)->yeniDeger); verilen map’deki istenen key degerine sahip elemanin value’sunu gunceller key map’te yoksa ekler
		System.out.println(exampleMap.compute("Chelsea", (key,value)->2));
		System.out.println(exampleMap.compute("Barcelona", (key,value)->5));
		System.out.println(exampleMap); //{Bayern Munih=6, Liverpool=6, Milan=7, Barcelona=5, Real Madrid=13, Chelsea=2}
		
		// 9) ComputeIfPresent(key, (key,value)->yeniDeger); istenen key degeri Map’de varsa o key’e ait value’yu gunceller, map’de yoksa birsey yapmaz
		System.out.println(exampleMap.computeIfPresent("Chelsea", (key,value)->3));
		System.out.println(exampleMap);// {Bayern Munih=6, Liverpool=6, Milan=7, Barcelona=5, Real Madrid=13, Chelsea=3}
		
		// 10) ComputeIfAbsent(key, k ->yeniDeger); istenen key degeri map’de yoksa o key’i ve value’yu ekler, map’de varsa birsey yapmaz
		System.out.println(exampleMap.computeIfAbsent("M.United", k->3));
		System.out.println(exampleMap.computeIfAbsent("Liverpool", k->8)); // liverpoolu degistirmedi
		System.out.println(exampleMap);//{M.United=3, Bayern Munih=6, Liverpool=6, Milan=7, Barcelona=5, Real Madrid=13, Chelsea=3}
		
		//11) putIfAbsent(key, value); verilen key map’de yoksa ekler.
		System.out.println(exampleMap.putIfAbsent("M.United", 12)); // m.unitedi 12 yapmadý
		System.out.println(exampleMap);// {M.United=3, Bayern Munih=6, Liverpool=6, Milan=7, Barcelona=5, Real Madrid=13, Chelsea=3}
		
		// 12) size(); map’teki entry sayisini verir 
		System.out.println(exampleMap.size()); // 7 




		
		
		
		

	}

}
