package _04_stringManipulations;

import java.util.Scanner;

public class Q_08_ {

	public static void main(String[] args) {
		/*
         * Kulanicidan bir kelime istemek eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. de�il ise girilen kelimeyi yazdirin
         *
         * �rnek
         * girdi = Ali
         * ��kt� = lilili
         *
         * girdi = el
         * ��kt� = el
         */
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen bir kelime giriniz");
		 String kelime=scan.next();
		 String uclu=kelime.substring(kelime.length()-2, kelime.length());
		 if (kelime.length()>=3) {
			 System.out.println(uclu+uclu+uclu);
		} else if (kelime.length()==2){
			 System.out.println(kelime);

		}else {
			System.out.println("harf degil kelime giriniz");
		}
scan.close();
	}

}
