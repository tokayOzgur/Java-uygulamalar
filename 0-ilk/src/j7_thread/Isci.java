package j7_thread;

public class Isci extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("İşçi sınıfı çalışmaya başladı. Thread adı: " + Thread.currentThread().getName());
			Thread.sleep(10000);
			System.out.println("İşi sınıfı çalışmasını bitirdi. Thread adı: " + Thread.currentThread().getName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		super.run();
	}
}
