package _05_stringManipulations;



public class Q_9_ {

	public static void main(String[] args) {
		/*
		StringMethods:
		cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    ORNEK:
     	INPUT      :  Python
		OUTPUT :   Pyt
*/
		
		
		 String kelime="Python";
		 
		 if (kelime.length()%2==0) {
			System.out.println(kelime.substring(0, kelime.length()/2));
		} else {
			System.out.println("degisken cift haneli degil");

		}

	}

}
