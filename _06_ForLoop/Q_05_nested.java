package _07_ForLoop;

public class Q_05_nested {

	public static void main(String[] args) {
		// // A�a��daki �ekilde ��kt� veren program� print i�erisinde
		// sadece bir tane # kullanarak yaz�d�r�n�z

//      #####
//      #####
//      #####
//      #####
//      #####

        for (int satir = 1; satir <=5; satir++) { // sat�r kontrolu 1 ile 6 da olurdu
        	
        	System.out.println();
        	for (int sutun = 1; sutun <=5; sutun++)  // sutun kontrolu for body tek sat�r oldg i�in {} kullanmad�k
        		
        		System.out.print("#");
				
			
			
		}
	}

}
