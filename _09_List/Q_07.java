package _09_List;

public class Q_07 {

	public static void main(String[] args) {
		/*
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
		int arr[]={ 1, 2, 3, 4, 4, 3, 2, 3 };
		boolean result=false;
		for (int i = 0; i < arr.length/2; i++) {
			if ( arr [i]==arr[arr.length-1-i]) {
				result=true;
			
			} else {
				result=false;
				break;	
			}
		}
		System.out.println(result);
	}
}
