package j4_generic_packet_jar;

import java.util.Iterator;

public class j0_generic {
	public static void main(String[] args) {
		String isimler[] = { "ali", "ayşe", "ismail", "ömer" };
		Integer[] sayilar = { 1, 2, 3, 4, 5 };

//		Dizi yazdırma - normal
//		StringDiziYazdir.yazdir(isimler);
//		System.out.println("\n");
//		IntDiziYazdir.yazdir(sayilar);

//		Dizi yazdırma - Generic
		System.out.println("\nGeneric Dizi Yazdırma");
		GenericDiziYazdir<String> dizi = new GenericDiziYazdir<String>();
		dizi.diziYazdir(isimler);
		System.out.println("\n");

		GenericDiziYazdir<Integer> dizi2 = new GenericDiziYazdir<Integer>();
		dizi2.diziYazdir(sayilar);
	}
}

// Dizi yazdırma sınıfı
class StringDiziYazdir {
	public static void yazdir(String[] dizi) {
		for (String item : dizi) {
			System.out.print(item + ", ");
		}
	}
}

class IntDiziYazdir {
	public static void yazdir(int[] dizi) {
		for (int item : dizi) {
			System.out.print(item + ", ");
		}
	}
}

//*** Generic Dizi Yazdır ***
class GenericDiziYazdir<GelenVeriTuru> {
	public void diziYazdir(GelenVeriTuru[] dizi) {
		for (GelenVeriTuru gelenVeriTuru : dizi) {
			System.out.print(gelenVeriTuru + ", ");
		}
	}
}
