package t16_thread.multiThread3;
//메인스레드
public class T01Run {
	public static void main(String[] args) {
		//동시성 먼저 만들었다고 먼저 가는게 아님 마지막도 마찬가지
		//자막객체 생성 실행
		Thread smiThread = new SMIFile();
		smiThread.start();
		
		Thread screenThread = new screenFile();
		screenThread.start();
		
	}
}
//영상을 처리하는 스레드
class screenFile extends Thread{
	@Override
	public void run() {
	//#1. 영상프레임 1~5컷트
		int[] screenArray = {1,2,3,4,5};
		
	//#3. 영상출력
		for(int i=0;i<screenArray.length;i++) {
			System.out.print("영상프레임: "+screenArray[i]);
			try { Thread.sleep(500);} catch (InterruptedException e) {}//쓰레드를 잠깐 멈추게 할때 이렇게 씀
		}
	}
}

//자막을 처리하는 스레드
class SMIFile extends Thread{
	@Override
	public void run() {
	//#2. 각 프레임에 표시될 자막
		String[] smiArray = {"하나", "둘", "셋", "넷","다섯"};
		try { Thread.sleep(10);} catch (InterruptedException e) {}
		
		//#4. 자막출력
		for(int i=0;i<smiArray.length;i++) {
			System.out.println(" - 자막프레임: "+smiArray[i]);
			try { Thread.sleep(500);} catch (InterruptedException e) {}//쓰레드를 잠깐 멈추게 할때 이렇게 씀
		}
	}
}

