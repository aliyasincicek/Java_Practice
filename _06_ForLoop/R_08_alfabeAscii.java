package _06_ForLoop;

public class R_08_alfabeAscii {

	public static void main(String[] args) {
	/*	'a' ile 'z' aras�ndaki karakterlerin ascii de�erlerini yazd�ran bir Java program� yaz�n.
*/
		
		String text="abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i <text.length() ; i++) {
			System.out.println(" Ascii value of "+ text.charAt(i)+" = "+ text.codePointAt(i));
			
		}
		
	}
		}
		


