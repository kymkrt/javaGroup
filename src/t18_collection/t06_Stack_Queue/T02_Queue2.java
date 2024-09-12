package t18_collection.t06_Stack_Queue;

import java.util.LinkedList;
//인터페이스로 되어있음 리스트처럼 사용
import java.util.Queue;
//예외처리 포함
public class T02_Queue2 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>(); //안에 추상메소드가 너무 많아서 쓰기 힘드니까 링크드리스트를 구현객체로 사용
		
		System.out.println("1.크기: "+queue.size());
		System.out.println("1.내용: "+queue);
		System.out.println();
		
		//자료삽입 offer()
		queue.offer(30);
		queue.offer(33);
		queue.offer(23);
		queue.offer(16);
		queue.offer(26);
		System.out.println("2.aa크기: "+queue.size());
		System.out.println("2.내용: "+queue);
		System.out.println("");
		
		//바로 아래자료 쳐다보기: 
		System.out.println("3.바로아래자료: "+queue.peek());
		System.out.println("");
		
		//꺼내기(지우기): poll() FIFO 방식(First In First Out) 선입 선출
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		System.out.println(".크기: "+queue.size());
		System.out.println(".내용: "+queue);
		System.out.println("");
		
		
		//다지운 데이터를 볼때 peek는 이미 예외처리가 되어있어서 오류 안남 element는 오류남 
		//다지우고도 또지우면 에러남 poll은 제외 자동예외
		queue.poll();
	}
}
