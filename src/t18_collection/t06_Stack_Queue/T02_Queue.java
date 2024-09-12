package t18_collection.t06_Stack_Queue;

import java.util.LinkedList;
//인터페이스로 되어있음 리스트처럼 사용
import java.util.Queue;
//예외처리 미포함
public class T02_Queue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>(); //안에 추상메소드가 너무 많아서 쓰기 힘드니까 링크드리스트를 구현객체로 사용
		
		System.out.println("1.크기: "+queue.size());
		System.out.println("1.내용: "+queue);
		System.out.println();
		
		//자료삽입 add() 리스트 자료 구조형
		queue.add(30);
		queue.add(33);
		queue.add(23);
		queue.add(16);
		queue.add(26);
		System.out.println("2.크기: "+queue.size());
		System.out.println("2.내용: "+queue);
		System.out.println("");
		
		//바로 아래자료 쳐다보기: 
		System.out.println("3.바로아래자료: "+queue.element());
		System.out.println("");
		
		//꺼내기(지우기): remove FIFO 방식(First In First Out) 선입 선출
		queue.remove();
		System.out.println(".크기: "+queue.size());
		System.out.println(".내용: "+queue);
		System.out.println("");
		
		//다지우고도 또지우면 에러남
	}
}
