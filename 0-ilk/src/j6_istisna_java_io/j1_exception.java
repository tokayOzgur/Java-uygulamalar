package j6_istisna_java_io;

public class j1_exception {

	public static void main(String[] args) {
		try {
			Integer i = new Integer("asd");
			System.out.println(i);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hata: " + e.toString());
		} finally {
			System.out.println("Finaly");
		}

		// birden çok cathc kullanmak
		try {

		} catch (NumberFormatException e) {
			// TODO: handle exception
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

		// throw
		try {

		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally {

		}

//		**** throws ****
		try {
			metot();

		} catch (NumberFormatException e) {
			// TODO: handle exception
			
		}

	}

	private static void metot() throws NumberFormatException {
		// TODO Auto-generated method stub
		Integer sayi = Integer.parseInt("abc");
	}
}
