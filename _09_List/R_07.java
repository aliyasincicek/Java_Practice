package _09_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R_07 {

	public static void main(String[] args) {
		/*
		 * write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array
Input :{1,2,3,4,5,6}
element:6
Output : [1,2,3,4,5]
bir diziden belirli bir elemaný çýkarmak ve kalan elemanlarý yeni bir diziye koymak ve yeni diziyi basmak için bir Java programý yaz
Giriþ :{1,2,3,4,5,6}
eleman:6
Çýkýþ : [1,2,3,4,5]
		 */
		List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		list.remove(5);
		System.out.println(list);

	}

}
