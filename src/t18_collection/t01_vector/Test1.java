package t18_collection.t01_vector;

import java.util.List;
import java.util.Vector;

/*
Vector : List계열,List 자료 구조의 특징을 모두 갖는다
인덱스로 관리(0번부터), 순차처리, 앞에서부터 자료를 기억, 자료의 삽입/삭제시에 많은 시간이 소요될수 있음. 중복허용됨
'멀티스레드'의 동기화 (synchronized) 작업에 유리(필수는 아님), ArrayList 보다는 안정적

*/
public class Test1 {
	public static void main(String[] args) {
		//Vector vector = new Vector(); 가능은하다 하지만 하위타입 해주는게 더 맞다?
//		Vector<String> vector = new Vector(); //제네릭 뒤의 <>는 앞이랑 같아서 생략가능
//		List<String> vector = new Vector<String>(); //리스트 인터페이스 계열이라 리스트로 변경 가능
		Vector<String> vector = new Vector<String>();
		
		System.out.println("1.vector용량 : "+vector.capacity());//용량과 크기는 다르다 이건 용량 최대
		System.out.println("1.vector크기 : "+vector.size());//용량과 크기는 다르다 이건 크기 현재
		System.out.println("1.vector크기 : "+vector.toString());//내용 보기
		System.out.println("1.vector크기 : "+vector);//내용 보기 toString은 너무 많이 써서 생략가능
		System.out.println();
		
		//이미 제너릭으로 하위타입을 스트링으로 했기 때문에 스트링으로 넣는디
		//순차자료구조형이라 차례로 들어가고 인덱스 번호도 있어서 0부터 시작 어레이리스트하고 벡터는 배열과 같은구조로 만들어짐
		//자료삽입
		vector.add("홍길동");
		vector.add("김말숙");
		vector.add("이기자");
		vector.add("오하늘");
		vector.add("고인돌");
		vector.add("소나무");
		System.out.println("2.vector용량 : "+vector.capacity());
		System.out.println("2.vector크기 : "+vector.size());
		System.out.println("2.vector크기 : "+vector);
		System.out.println();
		
		//계속 자료를 추가하면 계속 뒤에 들어감
		vector.add("홍길동3");
		vector.add("김말숙3");
		vector.add("이기자3");
		vector.add("오하늘3");
		vector.add("고인돌3");
		vector.add("소나무3");
		System.out.println("3.vector용량 : "+vector.capacity());
		System.out.println("3.vector크기 : "+vector.size());
		System.out.println("3.vector크기 : "+vector);
		System.out.println();
		
		//자료검색 get
		System.out.println("4.vector.get(1) "+vector.get(1));
		System.out.println("4.vector.get(5) "+vector.get(5));
		System.out.println("4.vector.get(마지막인덱스번호) "+vector.get(vector.size()-1)); //마지막은 못본다 근데 오류가 배열 오류가 나오는데 배열 구조이기 때문임 -1해줘야 마지막 데이터가나옴
		System.out.println();
		
	//자료수정(set)
		vector.set(1, "강감찬");
		System.out.println("4.vector용량 : "+vector.capacity());
		System.out.println("4.vector크기 : "+vector.size());
		System.out.println("4.vector크기 : "+vector);
		System.out.println();
		
		//삭제(remove)
		vector.remove(1);//싱글스레드 순차처리라 지워지고 당겨지고 지워지고 당겨지는 방식이다
		vector.remove(3);
		vector.remove(5);
		System.out.println("5.vector용량 : "+vector.capacity());
		System.out.println("5.vector크기 : "+vector.size());
		System.out.println("5.vector크기 : "+vector);
		System.out.println();
		
		//자료삽입(add(인덱스 번호, 요소)) 인덱스 번호 없으면 무조건 뒤 인덱스, 번호 적으면 그 위치로
		vector.add(1, "그린");;
		System.out.println("6.vector용량 : "+vector.capacity());
		System.out.println("6.vector크기 : "+vector.size());
		System.out.println("6.vector크기 : "+vector);
		System.out.println();
		
		//모든자료 삭제
		vector.clear(); //다 날려도 용량은 그대로라 메모리에 남아있다 그래서 한번씩은 초기화 해주면 좋다
		System.out.println("7.vector용량 : "+vector.capacity());
		System.out.println("7.vector크기 : "+vector.size());
		System.out.println("7.vector크기 : "+vector);
		System.out.println();
		
		
	}
}