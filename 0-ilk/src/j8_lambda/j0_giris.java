package j8_lambda;

import java.util.ArrayList;
import java.util.Collection;

public class j0_giris {
	public static void main(String[] args) {
		Calisan c1 = new Calisan("Özgür", 24);
		Calisan c2 = new Calisan("c2", 34);
		Calisan c3 = new Calisan("c3", 44);
		Calisan c4 = new Calisan("c4", 54);

		ArrayList<Calisan> calisanlar = new ArrayList<Calisan>();
		calisanlar.add(c1);
		calisanlar.add(c2);
		calisanlar.add(c3);
		calisanlar.add(c4);

//		for (Calisan calisan : calisanlar) {
//			bilgileriYaz(new j0_yazdiran_interface() {
//
//				@Override
//				public void yazdir(Calisan calisan) {
//					// TODO Auto-generated method stub
//					System.out.println(calisan.getIsim() + " " + calisan.getYas());
//				}
//			}, calisan);
//		}

//		for (Calisan calisan : calisanlar) {
//			bilgileriYazdir(() -> System.out.println(calisan.getIsim() + " " + calisan.getYas()));
//		}

//		Collection.sort(calisanlar, (Calisan cal1, Calisan cal2) -> cal1.getIsim().compareTo(cal2.getIsim()));

	}

	public static void bilgileriYazdir(j0_yazdiran_interface yazdiranInterface, Calisan c) {
		yazdiranInterface.yazdir(c);
	}

}

class Calisan {
	private String isim;
	private int yas;

	public Calisan(String isim, int yas) {
		setIsim(isim);
		setYas(yas);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
}
