package _07_While_DoWhile;

public class rep_for_while_06 {

	public static void main(String[] args) {
		// Konsolda Alfabeyi Yazdýran programi yaziniz.
		
		
    
    // =====================for loop ile ================
   
	   for (char i = 'a'; i <='z'; i++) {
		System.out.print(i);
		
	}
    
    
    // =====================  while loop ile =============
	   System.out.print(" ");
	   char krk='a';
    		 while (krk<='z') {
				System.out.print(krk);
				krk++;
			}
    
    
    
    // =====================  do while loop ile =============
    		 System.out.print(" ");
    char harf='a';
    		do {
    			System.out.print(harf +" ");
    			harf++;
				
			} while (harf <='z');
    

	}

}
