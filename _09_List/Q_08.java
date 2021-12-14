package _09_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_08 {

	public static void main(String[] args) {
		/*
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */
		List <String> str=new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
		
		String eleman3=str.get(2);
		String eleman8=str.get(7);
		
		str.set(2, eleman8);
		str.set(7, eleman3);
		System.out.println(str);

	}

}
