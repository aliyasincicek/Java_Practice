package _09_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R_02 {

	public static void main(String[] args) {
		/*
		 * Create a 10-element list. Swap the 8th element with the 3rd element
INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
Output: [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
		 */
		List<String>names=new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
		
		String eleman3=names.get(2);
		String eleman8=names.get(7);
		names.set(2, eleman8);
		names.set(7, eleman3);
		System.out.println(names);
		
		

	}

}
