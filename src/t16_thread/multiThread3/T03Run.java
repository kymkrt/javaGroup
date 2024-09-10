package t16_thread.multiThread3;

public class T03Run {
	public static void main(String[] args) {
		//자막을 출력하는 쓰레드를 익명 이너 클래스 로 구현한다
		Thread smiTh1=new Thread(new Runnable() {
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
		});
		
		//영상을 출력하는 스레드 익명 이너 클래스로 구현
		Thread screenTh1 = new Thread(new Runnable() {
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
		});
		
		smiTh1.start();
		screenTh1.start();
	}
}
