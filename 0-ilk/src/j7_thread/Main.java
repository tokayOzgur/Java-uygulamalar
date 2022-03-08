package j7_thread;

public class Main {
	public static void main(String[] args) {
		System.out.println("Program başlatıldı. Thread adı: " + Thread.currentThread().getName());

		Isci isci1 = new Isci();
		isci1.start();

		System.out.println("Program bitti.");

	}
}
