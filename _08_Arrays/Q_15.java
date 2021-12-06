package _08_Arrays;

public class Q_15 {

	public static void main(String[] args) {
		/*
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarýnýn ayni olup olmadýðýný kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */
		int []arr={2,6,4,8,2,6,2};
		arr[0]=2;
		arr[arr.length-1]=2;
		boolean x=false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[0]==arr[arr.length-1])
				x=true;
				
			
		}
		System.out.println("ilk ve son eleman ayni mi? " +x);
	}

}
