package j5_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class j0_giris {
	public static void main(String[] args) {
		ArrayList<Integer> sayilar = new ArrayList<>();
		sayilar.add(10);
		sayilar.add(12);
		sayilar.add(11);
		sayilar.add(13);
		sayilar.add(14);
		sayilar.add(16);

		boolean bosMu = sayilar.isEmpty();
		System.out.println(bosMu);

		//
		System.out.println(sayilar.get(0));
		sayilar.set(0, 25);
		System.out.println(sayilar.get(0));

// belirli indexteki elemanları yeni listeye atma
		List<Integer> sayilarYedek = sayilar.subList(1, 3);
		System.out.println(sayilarYedek);

//		Arrayi listeye dönüştürmek
		Integer[] test = { 1, 2, 3, 4, 5 };
		List<Integer> testListe;

//		yöntem 1
		testListe = Arrays.asList(test); // geriye bir liste döndürür
		System.out.println(testListe);

//		********* İterator ve ListIterator ***********

		System.out.println("********* İterator ve ListIterator ***********");
		ArrayList<Integer> sayilar1 = new ArrayList<>();
		sayilar1.add(1);
		sayilar1.add(2);
		sayilar1.add(3);
		sayilar1.add(5);
		sayilar1.add(6);
		sayilar1.add(7);

		System.out.println("For döngüsü ile Sayılar1 elemanları; ");
		for (int i = 0; i < sayilar.size(); i++) {
			System.out.print(sayilar1.get(i) + ", ");
		}

		System.out.println("\n\nForeach döngüsü ile Sayılar1 elemanları; ");
		for (Integer eleman : sayilar1) {
			System.out.print(eleman + ", ");
		}

//		iterator ile elemanları gezme
		System.out.println("\n\nİterator ile listenin gezilmesi; ");
		Iterator<Integer> iterator = sayilar1.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + ", ");
		}

//		ListIterator ile elemanları gezme
		System.out.println("\n\nListİterator ile listenin gezilmesi; ");
		ListIterator<Integer> listIterator = sayilar1.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + ", ");
		}
		
//		ListIterator ile sondan başa elemanları gezme
		System.out.println("\n\nListİterator ile listenin sondan başa gezilmesi; ");
		ListIterator<Integer> listIterator2 = sayilar1.listIterator(sayilar1.size());
		while (listIterator2.hasPrevious()) {
			System.out.print(listIterator2.previous()+ ", ");
		}
	}

}
