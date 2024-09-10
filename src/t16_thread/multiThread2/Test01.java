package t16_thread.multiThread2;

public class Test01 extends Thread{
	int cnt =0;
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			if(Thread.currentThread().getName().equals("mbc")) {
				cnt++;
				System.out.println(cnt+" mbc스레드가 지나갑니다");
			}
			System.out.println(i+".스레드명 : "+Thread.currentThread().getName());
			try {Thread.sleep(500);} catch (InterruptedException e) {}
			System.out.println();
		}
	}
}