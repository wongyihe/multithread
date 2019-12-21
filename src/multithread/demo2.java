package multithread;

public class demo2 {

	public static void main(String[] args) {

		System.out.println("begin");
		myrunnable r1 = new myrunnable(1, 10);
		myrunnable r2 = new myrunnable(2, 8);
		myrunnable r3 = new myrunnable(3, 6);
		System.out.println("end");

	}

}

class myrunnable implements Runnable {

	int id;
	Thread t;

	public myrunnable(int id, int p) {
		super();
		this.id = id;
		t = new Thread(this);
		t.setPriority(p);
		t.start();
	}

	@Override
	public void run() {
		int i;
		for (i = 0; i < 10; i++)
			System.out.println("runnable" + id);
	}

}
