package j4_generic_packet_jar;

public class j1_generic_method {
	public static void main(String[] args) {
		String isimler[] = { "ali", "ayşe", "ismail", "ömer" };
		Integer[] sayilar = { 1, 2, 3, 4, 5 };

		DiziYazdir(isimler);
		DiziYazdir(sayilar);
		
	}

	public static <Genel> void DiziYazdir(Genel[] dizi) {
		for (Genel item : dizi) {
			System.out.print(item + ", ");
		}
	}
}
