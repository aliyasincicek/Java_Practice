package _08_Arrays;

public class R_03 {

	public static void main(String[] args) {
		/*Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
		 * Bir String'i parametre olarak kabul eden ve verilen string'de bulunan rakamlarýn toplamýný yazdýran bir metot yazýn.

input : ade1r4d3

output : 8

     Hint :
     Use Character.isDigit()
     Integer.valueOf()
				*/
		
		String input="ade1r4d3";
		String ary[]=input.split("");
		int output=0;
		for (int i = 0; i < ary.length; i++) {
			if (Character.isDigit(ary[i].charAt(0))) {
				output+=Integer.valueOf(ary[i]);
			}
			
		}System.out.println(output);
	}

}
