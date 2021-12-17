package _11_Varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_02 {

	public static void main(String[] args) {
	    // verilen int lerden ilki haric tum sayilari toplayan ve
					// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.
			
		@SuppressWarnings("unused")
		List<Integer> sayi1 = new ArrayList<>(Arrays.asList(5,8,23,65,21,47,44,10,16));
			
			topla(2,3,40,50,60);
			topla(2,3,4,5);

	}

	private static void topla(int carpsayi,int...toplsayi) {
		int toplam=0;
		for (int each : toplsayi) {
			toplam+=each;
		}
		System.out.println(carpsayi*toplam);
	}

}
