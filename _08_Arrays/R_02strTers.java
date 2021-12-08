package _08_Arrays;

import java.util.Arrays;

public class R_02strTers {

	public static void main(String[] args) {
		/*Write a Java program that reverse a sentence by using Array (with all spaces and special characters).
		// Array (tüm boþluklar ve özel karakterlerle) kullanarak bir cümleyi tersine çeviren bir Java programý yazýn.
		Input : Coding is greate         Output : .etaerg si gnidoC
         */
		
		String x="Coding is greate.";
		String y[]=x.split("");
		System.out.println(Arrays.toString(y));
		String a="";
		String output = "";
		for (int i = y.length-1; i >= 0; i--) {
			a+=y[i];
			output=a.replace(", ", " ");
			
		}

System.out.println(output);
	}

}
