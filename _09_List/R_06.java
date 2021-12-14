package _09_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R_06 {

	public static void main(String[] args) {
		/*
		 * Write a program to find the common elements between two String Arrays (without case sensitivity)
          Input1 : {John,Brad,Ange,Sofia,Emily}
          Input2 : {sofia,brad,grace,emily,hazel}
          Output : [sofia,brad,emily]
          
          Ýki String Dizisi arasýndaki ortak öðeleri bulan bir program yazýn (büyük/küçük harf duyarlýlýðý olmadan)
          Girdi1 : {John,Brad,Ange,Sofia,Emily}
          Girdi2 : {sofya,brad,zarafet,emily,hazel}
           Çýktý: [sofya,brad,emily]
		 */
		
	/*	String arr1[]={"John","Brad","Ange","Sofia","Emily"};
		String arr2[]={"sofya","brad","zarafet","emily","hazel"};
		List<String> output=new ArrayList<>();
		
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1.equals(arr2)) {
					output.add(arr1[i]);
					
				}
				
			}
			
		}
System.out.println(output);
*/
		List<String> input1=new ArrayList<>(Arrays.asList("John","Brad","Ange","Sofia","Emily"));	
		List<String> input2=new ArrayList<>(Arrays.asList("sofia","brad","grace","emily","hazel"));	
		List<String> output=new ArrayList<>();
		for (String s1 : input1) {
			for (String s2 : input2) {
				if (s1.equalsIgnoreCase(s2)) {
					output.add(s1);
				}
			}	
		}
        	System.out.println(output);
	}
}
