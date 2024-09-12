package t18_collection.t03arrayList;

import java.util.ArrayList;
import java.util.List;

/*
 벡터하고 같다
ArrayList : List계열, List 자료 구조의 특징을 갖는다
인덱스로 관리(0번부터), 순차처리, 앞에서부터 자료를 기억, 자료의 삽입/삭제시에 많은 시간이 소요될수 있음. 중복허용됨
'멀티스레드'의 동기화 (synchronized) 작업에 유리(필수는 아님), ArrayList 보다는 안정적

*/
public class Test1 {
	public static void main(String[] args) {
//		ArrayList<String> arrayList = new ArrayList<String>();
//		ArrayList<String> arrayList = new ArrayList();
//		List<String> arrayList = new ArrayList<String>();
		ArrayList<String> arrayList = new ArrayList();
		//얘는 인덱스는 있지만 나중에 나온거라 capacity 는 안됨
		
//		System.out.println("1.ArrayList용량 : "+arrayList.capacity());//용량과 크기는 다르다 이건 용량 최대
		System.out.println("1.ArrayList크기 : "+arrayList.size());//용량과 크기는 다르다 이건 크기 현재
		System.out.println("1.ArrayList크기 : "+arrayList.toString());//내용 보기
		System.out.println("1.ArrayList크기 : "+arrayList);//내용 보기 toString은 너무 많이 써서 생략가능
		System.out.println();
		
		//이미 제너릭으로 하위타입을 스트링으로 했기 때문에 스트링으로 넣는디
		//순차자료구조형이라 차례로 들어가고 인덱스 번호도 있어서 0부터 시작 어레이리스트하고 벡터는 배열과 같은구조로 만들어짐
		//자료삽입
		arrayList.add("홍길동");
		arrayList.add("김말숙");
		arrayList.add("이기자");
		arrayList.add("오하늘");
		arrayList.add("고인돌");
		arrayList.add("소나무");
		System.out.println("2.ArrayList크기 : "+arrayList.size());
		System.out.println("2.ArrayList크기 : "+arrayList);
		System.out.println();
		
		//계속 자료를 추가하면 계속 뒤에 들어감
		arrayList.add("홍길동3");
		arrayList.add("김말숙3");
		arrayList.add("이기자3");
		arrayList.add("오하늘3");
		arrayList.add("고인돌3");
		arrayList.add("소나무3");
		System.out.println("3.ArrayList크기 : "+arrayList.size());
		System.out.println("3.ArrayList크기 : "+arrayList);
		System.out.println();
		
		//자료검색 get
		System.out.println("4.ArrayList.get(1) "+arrayList.get(1));
		System.out.println("4.ArrayList.get(5) "+arrayList.get(5));
		System.out.println("4.ArrayList.get(마지막인덱스번호) "+arrayList.get(arrayList.size()-1)); //마지막은 못본다 근데 오류가 배열 오류가 나오는데 배열 구조이기 때문임 -1해줘야 마지막 데이터가나옴
		System.out.println();
		
	//자료수정(set)
		arrayList.set(1, "강감찬");
		System.out.println("4.ArrayList크기 : "+arrayList.size());
		System.out.println("4.ArrayList크기 : "+arrayList);
		System.out.println();
		
		//삭제(remove)
		arrayList.remove(1);//싱글스레드 순차처리라 지워지고 당겨지고 지워지고 당겨지는 방식이다
		arrayList.remove(3);
		arrayList.remove(5);
		System.out.println("5.ArrayList크기 : "+arrayList.size());
		System.out.println("5.ArrayList크기 : "+arrayList);
		System.out.println();
		
		//자료삽입(add(인덱스 번호, 요소)) 인덱스 번호 없으면 무조건 뒤 인덱스 번호 적으면 그 위치로
		arrayList.add(1, "그린");;
		System.out.println("6.ArrayList크기 : "+arrayList.size());
		System.out.println("6.ArrayList크기 : "+arrayList);
		System.out.println();
		
		//향상된 for문을 이용한 자료의 출력 검색도가능
		for(String name:arrayList) {//넘어오는 하위타입의 자료형을 사용
			System.out.print(name+"/");
		}
		System.out.println("\n");
		
		//모든자료 삭제
		arrayList.clear(); //다 날려도 용량은 그대로라 메모리에 남아있다 그래서 한번씩은 초기화 해주면 좋다
		System.out.println("7.ArrayList크기 : "+arrayList.size());
		System.out.println("7.ArrayList크기 : "+arrayList);
		System.out.println();
		
		
	}
}