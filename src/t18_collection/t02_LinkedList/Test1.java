package t18_collection.t02_LinkedList;

import java.util.LinkedList;
import java.util.List;

/*
LinkedList : List계열,List 자료 구조의 특징을 갖는다 모두는 아님 
인덱스 없음(주소로관리) 따라서 순차처리개념이 없다. 많은 자료의 순차검색시는 주소를찾기 때문에 오래걸린다 
자료의 삽입/삭제는 처리속도가 빠르다 따라서 자료의 삽입/삭제가 빈번한 자료구조에 적합하다
'이중 링크드 리스트(앞주소-데이터-뒤주소)'의 자료구조로 설계되어 있기에 복구작업이 가능하다 
*/
public class Test1 {
	public static void main(String[] args) {
		//벡터와 같다
//		LinkedList<String> linkedList = new LinkedList<String>();
//		List<String> linkedList = new LinkedList<>();
		LinkedList<String> linkedList = new LinkedList();
		
//		System.out.println("1.linkedList용량 : "+linkedList.capacity());//배열이 아니라 용량의 개념이 없다
		System.out.println("1.linkedList크기 : "+linkedList.size());//이건 크기 현재
		System.out.println("1.linkedList크기 : "+linkedList.toString());//내용 보기
		System.out.println("1.linkedList크기 : "+linkedList);//내용 보기 toString은 너무 많이 써서 생략가능
		System.out.println();
		
		//이미 제너릭으로 하위타입을 스트링으로 했기 때문에 스트링으로 넣는디
		//자료삽입
		linkedList.add("홍길동");
		linkedList.add("김말숙");
		linkedList.add("이기자");
		linkedList.add("오하늘");
		linkedList.add("고인돌");
		linkedList.add("소나무");
		System.out.println("2.linkedList크기 : "+linkedList.size());
		System.out.println("2.linkedList크기 : "+linkedList);
		System.out.println();
		
		//계속 자료를 추가하면 계속 뒤에 들어감
		linkedList.add("홍길동3");
		linkedList.add("김말숙3");
		linkedList.add("이기자3");
		linkedList.add("오하늘3");
		linkedList.add("고인돌3");
		linkedList.add("소나무3");
		System.out.println("3.linkedList크기 : "+linkedList.size());
		System.out.println("3.linkedList크기 : "+linkedList);
		System.out.println();
		
		//자료검색 get
		System.out.println("4.linkedList.get(1) "+linkedList.get(1));
		System.out.println("4.linkedList.get(5) "+linkedList.get(5));
		System.out.println("4.linkedList.get(마지막위치) "+linkedList.get(linkedList.size()-1)); //마지막은 못본다 -1해줘야 마지막 데이터가나옴
		System.out.println();
		
	//자료수정(set)
		linkedList.set(1, "강감찬");
		System.out.println("4.linkedList크기 : "+linkedList.size());
		System.out.println("4.linkedList크기 : "+linkedList);
		System.out.println();
		
		//자료삭제(remove) 인덱스 구조 아니고 주소구조
		linkedList.remove(1);
		linkedList.remove(3);
		linkedList.remove(5);
		System.out.println("5.linkedList크기 : "+linkedList.size());
		System.out.println("5.linkedList크기 : "+linkedList);
		System.out.println();
		
		//자료삽입(add(인덱스 번호, 요소)) 인덱스 번호 없으면 무조건 뒤 인덱스 번호 적으면 그 위치로? 이거 수정 필요
		linkedList.add(1, "그린");;
		System.out.println("6.linkedList크기 : "+linkedList.size());
		System.out.println("6.linkedList크기 : "+linkedList);
		System.out.println();
		
		//모든자료 삭제
		linkedList.clear(); //다 날려도 용량은 그대로라 메모리에 남아있다 그래서 한번씩은 초기화 해주면 좋다
		System.out.println("7.linkedList크기 : "+linkedList.size());
		System.out.println("7.linkedList크기 : "+linkedList);
		System.out.println();
		
		
	}
}