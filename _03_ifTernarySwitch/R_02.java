package _03_ifTernarySwitch;

public class R_02 {

	public static void main(String[] args) {
/*Verilen iki say�n�n (s�f�rdan b�y�k veya s�f�ra e�it) toplam�n� hesaplayan ve yazd�ran bir Java program� yaz�n. 
 * Verilen tamsay�lar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazd�r�n.
Ornek:
INPUT :25  46
OUTPUT :
Numaralarin Toplami:71 */
		
		int a=25;
	    int b=46;
	    if (a+b>1000000000) {
	      System.out.println("OverFlow");
	    }else {System.out.println(a+b);}
	
	}

}
