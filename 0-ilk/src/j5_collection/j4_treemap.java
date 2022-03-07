package j5_collection;

import java.util.Comparator;
import java.util.TreeMap;

public class j4_treemap {
	public static void main(String[] args) {

		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("özgür", 1);
		treeMap.put("kağan", 2);
		treeMap.put("ibrahim", 3);
		treeMap.put("barış", 4);
		treeMap.put("yunus", 5);

		System.out.println(treeMap);

		TreeMap<Kare, String> kareStringTreeMap = new TreeMap<Kare, String>(new Comparator<Kare>() {
			@Override
			public int compare(Kare o1, Kare o2) {
				System.out.println("compare metodu çalıştı");
				if (o1.kenar < o2.kenar)
					return -1;
				else if (o1.kenar > o2.kenar)
					return 1;
				else
					return 0;
			}
		});

		Kare k1 = new Kare(1, "mavi");
		Kare k2 = new Kare(2, "sarı");
		Kare k3 = new Kare(3, "kırmızı");
		Kare k4 = new Kare(4, "siyah");

		kareStringTreeMap.put(k1, "k1");
		kareStringTreeMap.put(k2, "k2");
		kareStringTreeMap.put(k3, "k3");
		kareStringTreeMap.put(k4, "k4");

		kareStringTreeMap.toString();
		System.out.println(kareStringTreeMap);
	}
}

class Kare implements Comparable<Kare> {
	int kenar;
	String renk;

	public Kare(int kenar, String renk) {
		// TODO Auto-generated method stub
		this.kenar = kenar;
		this.renk = renk;
	}

	@Override
	public String toString() {
		return "Kare{" + "kenar= " + kenar + ", renk= " + renk + '\'' + "}";
	}

	@Override
	public int compareTo(Kare o1) {
		System.out.println("compareTo metodu çalıştı");
		if (this.kenar < o1.kenar)
			return -1;
		else if (this.kenar > o1.kenar)
			return 1;
		else
			return 0;
	}
}