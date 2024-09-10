package t16_thread.Properties;

public class Test1 {

	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		System.out.println("1.현재 스레드명: "+thread.getName());
		System.out.println("1.현재 동작하는 스레드 개수: "+Thread.activeCount()); //1개 main
		System.out.println();
		
		for(int i=0;i<3;i++) {
			Thread th = new Thread();
			th.start();
			System.out.println("2.현재 스레드명: "+th.getName());
		}
		//원래는 블록 나오면 삭제 되는데 작업시간이 정말 빨라서 메모리에 남아있는게 출력된다
		System.out.println("2.현재 동작하는 스래드 개수: "+Thread.activeCount());//2개이상
		System.out.println();
		
		for(int i=0;i<3;i++) {
			Thread th = new Thread();
			th.setName(i+"번째 스레드");
			th.start();
			System.out.println("3.현재 스레드명: "+th.getName());
		}
		//원래는 블록 나오면 삭제 되는데 작업시간이 정말 빨라서 메모리에 남아있는게 출력된다
		System.out.println("3.현재 동작하는 스래드 개수: "+Thread.activeCount());//2개이상
		System.out.println();
		
		for(int i=0;i<3;i++) {
			Thread th = new Thread();
			th.start();
			System.out.println("4.현재 스레드명: "+th.getName());
		}
		//원래는 블록 나오면 삭제 되는데 작업시간이 정말 빨라서 메모리에 남아있는게 출력된다
		System.out.println("4.현재 동작하는 스래드 개수: "+Thread.activeCount());//2개이상
		System.out.println();
		
		
		
		
	}
}
