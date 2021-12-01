package _03_ifTernarySwitch;

public class R_02 {

	public static void main(String[] args) {
/*Verilen iki sayýnýn (sýfýrdan büyük veya sýfýra eþit) toplamýný hesaplayan ve yazdýran bir Java programý yazýn. 
 * Verilen tamsayýlar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdýrýn.
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
