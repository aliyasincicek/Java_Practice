package _08_Arrays;

import java.util.Arrays;

public class Q_02_mdaTopl {

	public static void main(String[] args) {
		// multidimensional arrayin i� array lerindeki t�m elemanlar�n toplam�n� birer birer bulan
        // ve herbir sonucu yeni bir arrayin eleman� yapan ve yeni array i ekrana yazd�ran program� yaziniz.
        // input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
		
		int arr[][] = {{10,20,30},{4},{6,7,20}};
		int yeniarr[]=new int[arr.length];
		for (int kat = 0; kat < arr.length; kat++) {
			for (int daire = 0; daire < arr[kat].length; daire++) {
				yeniarr[kat]+=arr[kat][daire];
			}
			
		}
		System.out.println(Arrays.toString(yeniarr));

	}

}
