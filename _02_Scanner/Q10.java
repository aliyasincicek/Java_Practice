package _02_Scanner;

import java.util.Scanner;

public class Q10 {
	// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

	// formula
	    
	    // c = (f-32)*5/9



	    public static void main(String[] args) {

	        Scanner scan =new Scanner(System.in);
	        System.out.println("fahrenayt de�eri giriniz : ");

	        int f=scan.nextInt();
	        System.out.println("girdiginiz fahrenayt de�erinin santigrad derecesi : "+(f-32)*5/9);
	        scan.close();
    }
}
