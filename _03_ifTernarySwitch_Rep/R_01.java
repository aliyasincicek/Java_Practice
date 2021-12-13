package _03_ifTernarySwitch_Rep;

import java.util.Scanner;

public class R_01 {

	public static void main(String[] args) {
		/* Kullanýcýya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazýn (BMI)

IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

BMI 18,5'in altýndaysa zayýfsýnýz

BMI 18,5 ile 25 arasýnda ise kilonuz idealdir

BMI 25-30 arasýndaysa þiþmansýnýz

BMI 30'dan büyük veya eþitse, obez

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
			System.out.println("Sismansýnýz");
			
		}  else {
			System.out.println("Obez");
		}
   scan.close();
	
	
	
	
	
	}

}
