package _05_methodCreation;

public class Q_06 {

	public static void main(String[] args) {
		/*
        Problem tan�m� :
        Bir String i�indeki t�m karakterleri en fazla bir kez yazd�ran parametreli bir method yaz�n�z.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
		
		
		birkez("javac�lar �oook afilli arkada�lar");
	}

	private static void birkez(String str) {
		String sonuc="";
		for (int i = 0; i < str.length(); i++) {
			if (!sonuc.contains(str.substring(i, i+1))) {
				sonuc+=str.substring(i, i+1);
			}
		}
		System.out.println(sonuc);
	}

}
