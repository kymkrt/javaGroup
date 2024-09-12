package t16_thread.t_synchronized;

//공유객체
class MyData{
	int data = 10;
	
	public void plusMethod() {
		int mydata = data;
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		data=mydata+1;
	}
}

//공유객체를 사용하는 쓰레드
class useMyDate extends Thread{
	MyData myData = new MyData();
	
	@Override
	public void run() {
		myData.plusMethod();
		System.out.println(getName()+" 실행결과: "+myData.data);
	}
}

public class Test1 {
	public static void main(String[] args) {
		Thread th1 = new useMyDate();
		th1.start();

		Thread th2 = new useMyDate();
		th2.start();
		
		Thread th3 = new useMyDate();
		th3.start();
		
	}
}