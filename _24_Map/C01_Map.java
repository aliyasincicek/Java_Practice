package _24_Map;

import java.util.Arrays;
import java.util.HashMap;

public class C01_Map {

	public static void main(String[] args) {
		// Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz
		//Ornek : Input : Hellooo output : H=1, e=1, l=2, o=3 
		
		
		String str="Hellooo";
		harfsayisibul(str);
	}

	private static HashMap <String, Integer> harfsayisibul(String str) {
		
		HashMap<String, Integer> map=new HashMap<>();
		String arr[]=str.split("");
		System.out.println(Arrays.toString(arr));
		for (String each : arr) {
			if (!map.containsKey(each)) { // 1) containsKey(key); istenen key degeri Map’de varsa true, yoksa false doner .
				map.put(each, 1);
			} else {
				map.put(each, map.get(each)+1);// map.get(each)+1   bu girilen harf'in value'sunu bulup 1 artirir

			}
			
		}
		
	
		return map;
		
		
	}

}
