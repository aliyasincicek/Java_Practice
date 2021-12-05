package _06_methodCreation;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		/*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
		
		    Scanner scan = new Scanner(System.in);
	        System.out.println("bir kelime giriniz");
	        String kelime=scan.nextLine();
	        
	        
	        System.out.println(tespitEt(kelime));
	        scan.close();

	}

	private static boolean tespitEt(String kelime) {
		if (kelime.contains("xyz")) {
			return true;
		} else {
			 return false;
		}
		
		
	}
	/*public static boolean tespitEt(String kelime) {
    boolean flag=false;
    if (str.contains("xyz")) {
        flag=true;
    }
    return flag;
}*/
}
