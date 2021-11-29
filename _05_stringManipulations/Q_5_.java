package _05_stringManipulations;

public class Q_5_ {

	public static void main(String[] args) {
		 /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
     */
		
		String  str1= "$13.99";
	     String str2= "$10.55";
	     
	     str1=str1.replace("$", "");
	     str2=str2.replace("$", "");
	     
	   
	   double sayi1=Double.parseDouble(str1);
	   double sayi2=Double.parseDouble(str2);
	   
	   System.out.println("$13.99 ile $10.55 toplami = " + (sayi1 + sayi2)  + "$");
	   
		
	}

}
