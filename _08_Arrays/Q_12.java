package _08_Arrays;

import java.util.Arrays;

public class Q_12 {

	public static void main(String[] args) {
		//A�a��daki multi dimensional array�in i� array�lerindeki tum elemanlar�n
        //toplam�n� birer birer bulan ve herbir sonucu yeni bir array�in eleman� yapan
        // ve yeni array�i ekrana yazd�ran bir program yaz�n�z
        // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}
		
		 int arr[][] = {{1, 2, 3}, {4, 5, 11}, {6, 7}, {8, 9, 10}};
	       int arrToplam[]=new int[arr.length];
	       int top=0;
	       for (int i = 0; i < arr.length; i++) {
	    	   for (int j = 0; j < arr[i].length; j++) {
				top+=arr[i][j];
			}
			arrToplam[i]=top;
			top=0;
		}
	       
	      System.out.println(Arrays.toString(arrToplam));  
	} 

}
