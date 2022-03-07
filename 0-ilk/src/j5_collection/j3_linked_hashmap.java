package j5_collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class j3_linked_hashmap {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> linkedHashmap = new LinkedHashMap<String, Integer>();
		linkedHashmap.put("özgür", 1);
		linkedHashmap.put("kağan", 2);
		linkedHashmap.put("ibrahim", 3);
		linkedHashmap.put("barış", 4);
		linkedHashmap.put("yunus", 5);

		for (String gecici : linkedHashmap.keySet()) {
			System.out.print(gecici + ", ");
		}
		System.out.println("\n\n");
		for (int gecici : linkedHashmap.values()) {
			System.out.print(gecici + ", ");
		}
		System.out.println("\n\n");
		for (Entry<String, Integer> gecici : linkedHashmap.entrySet()) {
			System.out.print(gecici + ", ");
		}
		System.out.println("\n\n");

	}
}
