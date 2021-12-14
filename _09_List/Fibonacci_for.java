package _09_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci_for {

	public static void main(String[] args) {
		 /*
	     Kullanýcýdan alýnan bir tamsayýya kadar FIBONACCI dizisi oluþturun.
	     1-1-2-3-5-8-13-21-34....
	     */
		
		
		Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tamsayý giriniz : ");
        int sayi = scan.nextInt();
        
        List <Integer>fibonacci=new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        
		for (int i = 2; fibonacci.get(i-2)+ fibonacci.get(i-1)< sayi; i++) {
			fibonacci.add(fibonacci.get(i-2)+ fibonacci.get(i-1));
			
		
		}
		System.out.println(fibonacci);
		scan.close();
	}

}
