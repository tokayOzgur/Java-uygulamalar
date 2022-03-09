package j7_thread;

public class j0_Main {
	public static void main(String[] args) {
		System.out.println("Program başlatıldı. Thread adı: " + Thread.currentThread().getName());

		j0_Isci isci1 = new j0_Isci();
		isci1.start();

		System.out.println("Program bitti.");

//		Kullanım 2
		new Thread() {
			@Override
			public void run() {
				try {
					System.out.println("Thread inner class başladı");
					Thread.sleep(10000);
					System.out.println("Thread inner class bitti");
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			};
		}.start();

	}
}
