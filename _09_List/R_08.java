package _09_List;

import java.util.Scanner;

public class R_08 {

	public static void main(String[] args) {
		/*Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.
Input :I love Java.
Output: Reversed sentence : avaJ evol I. It is not a palindrome"

/*Bir c�mleyi parametre olarak kabul eden, StringBuilder kullanarak c�mleyi tersine �eviren ve c�mlenin palindrom olup olmad���n� kontrol eden 
 * (b�y�k/k���k harf duyarl�l��� olmadan) bir Java program� yaz�n. StringBuilder kullan�n.
 */
  //t�: Ters �evrilmi� c�mle : avaJ evol I. Bu bir palindrom de�il"

		
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
