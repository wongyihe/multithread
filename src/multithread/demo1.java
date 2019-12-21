package multithread;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("begin");
//		mythread t1=new mythread(1);
//		mythread t2=new mythread(2);
//		mythread t3=new mythread(3);
//		t1.start();
//		t2.start();
//		t3.start();		

//		mythread2 t1=new mythread2(1);
//		Thread.sleep(100);
//		mythread2 t2=new mythread2(2);
//		Thread.sleep(100);
//		mythread2 t3=new mythread2(3);
//		Thread.sleep(100);

		mythread2 t1 = new mythread2(1);
		t1.join(30);
		mythread2 t2 = new mythread2(2);
		t2.join(30);
		mythread2 t3 = new mythread2(3);
		t3.join(30);

		System.out.println("end");
	}

}

class mythread extends Thread {
	int id;

	public mythread(int id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		int i;
		for (i = 0; i < 10; i++)
			System.out.println("thread" + id);
		super.run();
	}
}

class mythread2 extends Thread {
	int id;

	public mythread2(int id) {

		this.id = id;
		start();
	}

	@Override
	public void run() {
		int i;
		for (i = 0; i < 10; i++)
			System.out.println("thread" + id);
		super.run();
	}
}