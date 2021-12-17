package _12_StringBuilder;

import java.util.Scanner;

public class Q_01_SBpalindrom {

	public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadýðýný kontrol eden (büyük/küçük harf duyarlýlýðý olmadan) bir Java programý yazýn.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String sentence=scan.nextLine();
		StringBuilder sb=new StringBuilder(sentence);
		 // StringBuilder  sb=new StringBuilder(scan.nextLine();
        //sb.append(metin);
		
		String rs=sb.reverse().toString();
		
		if (rs.equalsIgnoreCase(sentence)) {
			System.out.println("palindrom");
		} else {
			System.out.println("palindrom degil");
		}
	scan.close();
	}

}
