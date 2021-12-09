package _09_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q_02 {

	public static void main(String[] args) {
		 //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki t�m elemanlar� bir
        //listeye kopyalayan ve harf s�ras�na g�re yazd�ran bir METHOD yaz�n�z.
        //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
        //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
		
		String arr [][]= {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
		
		birlestir(arr);
		
	}

	private static void birlestir(String[][] arr) {
		
		List<String>list=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				list.add(arr[i][j]);
				
			}
			
			
		}
		System.out.println("ilk liste: "+ list);
		Collections.sort(list);
		System.out.println("Siralamadan sonra: "+ list);
	}

}
