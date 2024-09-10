package t16_thread.basicThread;

public class T02_ThreadProblem {

	public static void main(String[] args) {
		//#1. 영상프레임 1~5컷트
		int[] screenArray = {1,2,3,4,5};
		
		//#2. 각 프레임에 표시될 자막
		String[] smiArray = {"하나", "둘", "셋", "넷","다섯"};
		
		//#3. 영상출력
		for(int i=0;i<screenArray.length;i++) {
			System.out.println("영상프레임: "+screenArray[i]);
			try { Thread.sleep(500);} catch (InterruptedException e) {}//쓰레드를 잠깐 멈추게 할때 이렇게 씀
		}
		
		//#4. 자막출력
		for(int i=0;i<smiArray.length;i++) {
			System.out.println("자막프레임: "+smiArray[i]);
			try { Thread.sleep(500);} catch (InterruptedException e) {}//쓰레드를 잠깐 멈추게 할때 이렇게 씀
		}
		
		
		System.out.println("영화상영끝");
		
	}
}