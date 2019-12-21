package multithread;

public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("begin");
		myrunnable2 r1 = new myrunnable2(1, 0);
		myrunnable2 r2 = new myrunnable2(2, 0);
		myrunnable2 r3 = new myrunnable2(3, 0);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
//		new Thread(r1).start();
//		new Thread(r1).start();
//		new Thread(r1).start();
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("end");

	}

}

class myrunnable2 implements Runnable {

	int x;
	int id;
	Thread t;

	public myrunnable2(int id, int x) {
		super();
		this.id = id;
		this.x = x;

	}

	@Override
	public void run() {

		int i;
		for (i = 0; i < 10; i++) {
			synchronized (this)// 防止同步
			{
				x++;
				System.out.println("runnable" + id + "  x:" + x);
			}
		}
	}

}
