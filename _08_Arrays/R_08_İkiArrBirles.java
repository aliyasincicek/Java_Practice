package _08_Arrays;

import java.util.Arrays;

public class R_08_�kiArrBirles {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
		 * 2 tamsay� Diziyi parametre olarak kabul eden ve yeni bir Diziye 2 dizi ekleyen ve yazd�ran bir d�n�� y�ntemi yaz�n.
     Input1={1,2,3,4} Input2={5,6}                              Output={1,2,3,4,5,6}
		 */
		int [] x1= {1,2,3,4};
		int [] x2= {5,6};
		int [] sonuc=new int[x1.length+x2.length];
		for (int i = 0; i < x1.length+x2.length; i++) {
			if (i<x2.length) {
				sonuc[i]=x2[i];
			} else {
				sonuc[i]=x1[i-x2.length];
			}
		}
		Arrays.sort(sonuc);
		System.out.println(Arrays.toString(sonuc));
		

	}

}
