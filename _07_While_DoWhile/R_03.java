package _07_While_DoWhile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class R_03 {

	public static void main(String[] args) {
		/*Bir String icerisinde yinelenen karakterleri döndüren bir kod yazýniz.(mülakat Sorusu)
		Input :
		String str=“Javaisalsoeasy”
		Output: a s
		*/
		List<String>list=new ArrayList<>();
		String str="Javaisalsoeasy";
		String arr[]=str.split("");
		System.out.println(Arrays.toString(arr));
		String container="";
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					
					if (!container.contains(arr[i])) {
						container+=arr[i]+ " ";
						
					} 
				}
			}	
		}
		          System.out.println(container);
		
		
		} 
		 
     }
     
	
