package _07_ForLoop;

public class Q_05_nested {

	public static void main(String[] args) {
		// // Aþaðýdaki þekilde çýktý veren programý print içerisinde
		// sadece bir tane # kullanarak yazýdýrýnýz

//      #####
//      #####
//      #####
//      #####
//      #####

        for (int satir = 1; satir <=5; satir++) { // satýr kontrolu 1 ile 6 da olurdu
        	
        	System.out.println();
        	for (int sutun = 1; sutun <=5; sutun++)  // sutun kontrolu for body tek satýr oldg için {} kullanmadýk
        		
        		System.out.print("#");
				
			
			
		}
	}

}
