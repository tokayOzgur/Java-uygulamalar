package j5_collection;

import java.util.TreeMap;
import java.util.TreeSet;

public class j6_sorted_navigable {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("a");
		treeSet.add("b");
		treeSet.add("c");
		treeSet.add("d");

		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("a", 1);
		treeMap.put("b", 2);
		treeMap.put("c", 3);
		treeMap.put("d", 4);

		// sorted ve sortedMap metotları
		System.out.println(treeMap.comparator());
		System.out.println(treeSet.comparator());

		TreeSet<String> yedekTreeSet = (TreeSet<String>) treeSet.subSet("a", "c");

//		TreeMap<String, Integer> yedekTreeMap = (TreeMap<String, Integer>) treeMap.subMap("a", "c");

		System.out.println(yedekTreeSet);
		System.out.println(treeMap.subMap("a", "d"));

		// Navigable
		System.out.println(treeSet.lower("c")); // verilen elemandan bir küçük olanı geri dönüdürür
		System.out.println(treeMap.lowerKey("c"));
	}
}
