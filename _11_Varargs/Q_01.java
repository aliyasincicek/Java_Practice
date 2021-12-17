package _11_Varargs;

public class Q_01 {

	 public static void main(String[] args) {
        /* verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

*/
    
	 concat("h","a","c","e","r");
     concat("haným"," basrili"," qa");
     concat("b","e","s","i","k","t","a","s");
	 
	 
	 
	 
	 
	 }

	private static void concat(String... str) {
		String newstr="";
		for (String w : str) {
			newstr=newstr.concat(w);
			
		}
		System.out.println(newstr);
	}

	



}
