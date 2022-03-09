package j7_thread;

public class j1_main {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(j1_thread_renkler.Blue + "ben 10 saniyelik işlemi başlatıyorum ");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(j1_thread_renkler.Red + "ben 10 saniyelik işlemi bitirdim ");

	}
}
