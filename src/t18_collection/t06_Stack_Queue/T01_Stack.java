package t18_collection.t06_Stack_Queue;

import java.util.Stack;

/*
스택: LIFO(Last In First Out) 후입선출
*/
public class T01_Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("1.크기: "+stack.size());
		System.out.println("1.내용: "+stack);
		System.out.println();
		
		//삽입(push)
		stack.push(2);
		stack.push(4);
		stack.push(5);
		stack.push(9);
		stack.push(6);
		System.out.println("2.크기: "+stack.size());
		System.out.println("2.내용: "+stack);
		System.out.println();
		
		//검색: search() 뒤에서부터 1번임 
		System.out.println("3.검색(9): "+stack.search(9));
		System.out.println();
		
		//바로 아래 자료 쳐다보기: peek()
		System.out.println("4.: "+stack.peek());
		System.out.println();
		
		
		//꺼내기(pop)// 뒤에게 먼저나감 후입선출 지우는거나 마찬가지 중간부터지울수는 없음
		stack.pop();
		System.out.println(".크기: "+stack.size());
		System.out.println(".내용: "+stack);
		System.out.println();
		
		
		
		
	}
}
