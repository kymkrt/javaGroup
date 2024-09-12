package t18_collection.t05_Map;

import java.util.TreeMap;

/*
 * 키값으로 정렬된다 나올때도 삽입할때도
 * 해쉬맵하고 비슷하다 정렬차이
 */
public class T02_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();//제너릭 하위타입을 2개 줘야함 객체 필요
		
		//맵계열은 {}로 나온다 리스트는 []
		System.out.println("1.크기: "+map.size());
		System.out.println("1.자료: "+map);//toString 생략가능 
		System.out.println();
		
		//자료삽입: put(키, 값)
		map.put(11, "홍길동");
		map.put(13, "김말숙");
		map.put(21, "이기자");
		map.put(15, "강감찬");
		map.put(17, "오사랑");
		map.put(19, "고인돌");
		System.out.println("2.크기: "+map.size());
		System.out.println("2.자료: "+map);//키값으로 정렬해서 나온다
		System.out.println();
		
		//전부 키를 이용
		//추가 키값은 중복이 될수 없어서 덮어씀
		map.put(13, "김말자");
		map.put(20, "김말자");//키가 다르면 같은 데이터도 넣는다 
		System.out.println("3.크기: "+map.size());
		System.out.println("3.자료: "+map);//맵계열은 키도 같이 나옴 순서 관계 없음
		System.out.println();
		
		//검색: get() => 키값을 검색하여 자료를찾아준다
		System.out.println("4.검색키(13): "+map.get(13));//인덱스번호 아님 키값
		System.out.println();
		
		
		//수정: put()
		System.out.println("5.수정키(13): "+map.put(13,"이사랑"));//인덱스번호 아님 키값
		System.out.println("5.크기: "+map.size());
		System.out.println("5.자료: "+map);
		System.out.println();
		
		//삭제 remove()
		System.out.println("6.삭제키(13): "+map.remove(13));//인덱스번호 아님 키값
		System.out.println("6.크기: "+map.size());
		System.out.println("6.자료: "+map);
		System.out.println();
		
		//키값검색
		System.out.println("7.첫번째키: "+map.firstKey());
		System.out.println("7.마지막키: "+map.lastKey());
		System.out.println("7.첫번째키와값: "+map.firstEntry());
		System.out.println("7.마지막키와값: "+map.lastEntry());
		System.out.println("7.검색키보다 작은값: "+map.lowerKey(18));
		System.out.println("7.검색키보다 큰값: "+map.higherKey(18));
		System.out.println("7.검색키보다 큰값: "+map.get(map.higherKey(18)));//값찾기
		System.out.println();
		
		//모두삭제 clear()
		map.clear();
		System.out.println("8.크기: "+map.size());
		System.out.println("8.자료: "+map);
		System.out.println();
		
		
		
	}
}