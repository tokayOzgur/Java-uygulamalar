package j5_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class j1_linked_list {

	public static void main(String[] args) {
		LinkedList<Integer> sayilar = new LinkedList<Integer>();

		ArrayList<Integer> sayilar2 = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			sayilar.add((int) (Math.random() * 100));
			sayilar2.add((int) (Math.random() * 100));
		}

		System.out.println(sayilar);
		System.out.println(sayilar2);

		
	}

}
