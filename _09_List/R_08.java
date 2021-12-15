package _09_List;

import java.util.Scanner;

public class R_08 {

	public static void main(String[] args) {
		/*Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.
Input :I love Java.
Output: Reversed sentence : avaJ evol I. It is not a palindrome"

/*Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi tersine çeviren ve cümlenin palindrom olup olmadýðýný kontrol eden 
 * (büyük/küçük harf duyarlýlýðý olmadan) bir Java programý yazýn. StringBuilder kullanýn.
 */
  //tý: Ters çevrilmiþ cümle : avaJ evol I. Bu bir palindrom deðil"

		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle=scan.nextLine();
		String container="";
		 for (int i = cumle.length()-1; i >= 0; i--) {
			 container+=cumle.charAt(i);
			
		}
		 System.out.println(container);
		 if (cumle.equalsIgnoreCase(container)) {
			 System.out.println("palindrome");
			
		} else {
			 System.out.println("palindrome degil");

		}
		
scan.close();
	}

}
