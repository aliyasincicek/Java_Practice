package _03_ifTernarySwitch_Rep;

import java.util.Scanner;

public class R_01 {

	public static void main(String[] args) {
		/* Kullan�c�ya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yaz�n (BMI)

IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

BMI 18,5'in alt�ndaysa zay�fs�n�z

BMI 18,5 ile 25 aras�nda ise kilonuz idealdir

BMI 25-30 aras�ndaysa �i�mans�n�z

BMI 30'dan b�y�k veya e�itse, obez

Input:

Output:

Agirlik : 71

Boy : 1,72

BMI : 23.99945916711736

Zayifsiniz.
*/
	
        Scanner scan =new Scanner(System.in);
		
		System.out.print("boyunuzu giriniz ");
		double boy=scan.nextDouble();
		
		System.out.print("kilonuzu giriniz ");
		double kilo=scan.nextDouble();
		
		double  vke=kilo/(boy/100*boy/100);
		
		System.out.println(vke);
		
		if (vke<=18.5) {
			System.out.println("zayifsiniz");
		} else if(vke<=25) {
			System.out.println("kilonuz idealdir" );

		}else if(vke<=30) {
			System.out.println("Sismans�n�z");
			
		}  else {
			System.out.println("Obez");
		}
   scan.close();
	
	
	
	
	
	}

}
