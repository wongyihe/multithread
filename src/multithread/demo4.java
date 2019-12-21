package multithread;

public class demo4 {

	public static void main(String[] args) {
	System.out.println("begin");
	new Thread() {

		@Override
		public void run() {
			for(int i=0;i<100;i++)
				System.out.println("ya");
			super.run();
		}
	}.start();
	System.out.println("end");
	}

}
