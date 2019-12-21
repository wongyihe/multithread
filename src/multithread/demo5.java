package multithread;

import java.util.Scanner;

public class demo5 {

	public static void main(String[] args) {
//	app p=new app();
//	p.go();
		double pi=0;
		double s=4;
		double n=1;
		for(n=1;n<10000;n+=2) {
			pi+=s/n;
			s=-s;
			
		}
		System.out.println(pi);
	}
}
class app
{
	int n;
	int m;
	boolean b=true;
	void go()
	{
		
		m=1;
		new Thread() {

			@Override
			public void run() {
				while(n==1) 
				{
					m++;
				}
				super.run();
			}
			
		}.start();
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println(m);
	}
}
