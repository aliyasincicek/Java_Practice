package _03_ifTernarySwitch_Rep;

import java.util.Scanner;

public class R_07 {

	public static void main(String[] args) {
		// 2 kelime oluþturun: isim1 ve isim2
	    // isim1 çift sayýda karakter içeriyorsa,
	    // ikinci kelimeyi ilk adýn ortasýna yerleþtirin
	    // ilk kelime tek sayida karakter iceriyorsa
	    // “isim1, isim2 ye eklenemiyor” yazdýrýn
	    // Örneðin:
	    // isim1= mehmet
	    // isim2= ahmet
	    // Yazdýr ==> mehahmetmet
	    // isim1= memet
	    // isim2= ahmet
	    // Yazdýr ==> isim1, isim2 ye eklenemiyor
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 2 tane  isim yaziniz");
		String isim1=scan.nextLine();
		String isim2=scan.nextLine();
        if (isim1.length()%2==0) {
        	System.out.println(isim1.substring(0, isim1.length()/2) + isim2 + isim1.substring(isim1.length()/2, isim1.length()));
			
		} else {
			System.out.println("isim1, isim2 ye eklenemiyor");

		}
	}

}
