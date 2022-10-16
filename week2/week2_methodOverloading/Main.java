package week2_methodOverloading;

public class Main {

	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.topla(2, 3);

		System.out.println(sonuc);
		System.out.println(dortIslem.topla(2, 3, 5));

	}

}
