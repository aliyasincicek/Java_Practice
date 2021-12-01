package _06_methodCreation;

import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {
		/* StringMethods
        String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
       ORNEK:
        INPUT      :  goat
                      photo
                      ghost
                      kalem
        OUTPUT :      gat
                      hoto
                      ghost
                      lem
		 */
    
		Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz:");
        String str=scan.nextLine();
        
       
        System.out.println( ilkikisiz(str));
        
        
        scan.close();
	}

	private static String ilkikisiz(String str) {
		String kalanHarfler=""; 
		if (str.startsWith("gh")) {
			kalanHarfler=str;
		} else if (str.startsWith("g")) {
			kalanHarfler=str.substring(0, 1)+str.substring(2, str.length());

		}else if (str.charAt(1)=='h'){
			kalanHarfler=str.substring(1);
		} else {
			kalanHarfler=str.substring(2);
		}
		
	return kalanHarfler;	
	}

}
