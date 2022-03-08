package j5_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class j5_hashset_treeset {

	public static void main(String[] args) {
		// Kümelere benziyor.
		HashSet<String> harfler = new HashSet<String>();
		harfler.add("a");
		harfler.add("b");
		harfler.add("c");
		harfler.add("a");
		harfler.add("a");

		System.out.println(harfler);

		LinkedHashSet<Integer> sayilar = new LinkedHashSet<Integer>();
		sayilar.add(1);
		sayilar.add(2);
		sayilar.add(3);
		sayilar.add(1);
		sayilar.add(1);

		System.out.println(sayilar);

		TreeSet<String> isimler = new TreeSet<String>();
		isimler.add("ali");
		isimler.add("veli");
		isimler.add("ayşe");
		isimler.add("ali");
		isimler.add("ali");

		System.out.println(isimler);

		// Array çevirme
		Object[] geciciDizi = sayilar.toArray();

		for (Object x : geciciDizi) {
			System.out.print(x.toString() + ", ");
		}

	}

}
