package _09_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R_04 {

	public static void main(String[] args) {
	/*Write a program that deletes the letters 'a' from the names in the list given as input.
     INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     OUTPUT : [Veli,Omer]
      Girdi olarak verilen listedeki isimlerden 'a' harflerini silen bir program yazýnýz.
      GÝRÝÞ :list1={"Ali","Veli","Ayse","Fatma","Ömer"}
      ÇIKTI :[Veli,Ömer]
	 */
		List <String> input=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Ömer"));
		List <String> newList=new ArrayList<>();
	     for (String s : input) {
			if (!s.toLowerCase().contains("a")) {
	    		 newList.add(s);
		}	 
			} 
	  System.out.println(newList);
	}
}


