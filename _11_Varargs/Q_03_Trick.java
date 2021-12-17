package _11_Varargs;

public class Q_03_Trick {

	public static void main(String[] args) {
		int[] arr = {17, 23,6,34 };
		System.out.println("array toplami : "+arrTopla(arr));
		System.out.println("varargs toplami :"+varargsTopla(23,6,34,17));
		System.out.println("varargs ýn array parametreli toplami :"+varargsTopla(arr));
		
		//varargs array gibi davrandigi icin  herhangi bir arryi parametre olarak alabilir.
		
		

	}
   
	
	//Array elemalanri toplayan method
	private static int arrTopla(int[] arr) {
		int toplam=0;
		for (int i : arr) {
			toplam+=i;
			
		}
		return toplam;	
	}
	
	// varargs elemanleri toplayan method
	private static int varargsTopla(int...number) {
		int sum=0;
		for (int i : number) {
			sum+=i;
			
		}
		return sum;
	}
}
