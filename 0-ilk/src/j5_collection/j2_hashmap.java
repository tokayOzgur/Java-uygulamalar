package j5_collection;

import java.util.HashMap;
import java.util.Map;

public class j2_hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> plakalar = new HashMap<Integer, String>();
		plakalar.put(01, "Adana");
		plakalar.put(34, "İstanbul");
		plakalar.put(23, "Elazığ");
		plakalar.put(47, "Mardin");
		plakalar.put(06, "Ankara");
		plakalar.put(null, "Null Değer");

		System.out.println(plakalar);

		System.out.println(plakalar.get(47));
		System.out.println(plakalar.size());
		System.out.println(plakalar.containsKey(34));

		// yedek alma
		HashMap<Integer, String> yedek = new HashMap<Integer, String>();
		yedek.putAll(plakalar);
		System.out.println(yedek);

		// set
		for (Map.Entry<Integer, String> entry : plakalar.entrySet()) {
			System.out.println("key: " + entry.getKey() + " , " + " Value: " + entry.getValue());
		}
		
		// Soru- Veriler hangi sıraya göre belleğe ekleniyor?
	}
}
