package t18_collection.t04_Set;

import java.util.HashSet;
import java.util.Set;

/*
Set계열 :집합자료구조 - HashSet / TreeSet 사용빈도는 보통
인덱스정보없음 비순서자료구조 순서없음, 중복을 허용하지 않음(같은자료가 있을수 없음)
*/
public class T01_HashSet {
	public static void main(String[] args) {
//		HashSet<String> hash = new HashSet<String>();
		HashSet<String> hash = new HashSet<>();
//		Set<String> hash = new HashSet<String>();
		
		System.out.println("1.크기 : "+hash.size());
		System.out.println("1.내용 : "+hash);
		System.out.println();
		
		//자료의 추가(add)
		hash.add("홍길동");
		hash.add("김말숙");
		hash.add("이기자");
		hash.add("소나무");
		hash.add("강감찬");
		System.out.println("2.크기 : "+hash.size());//순서가 마구잡이임 (비순서자료구조)
		System.out.println("2.내용 : "+hash);
		System.out.println();
		
		
		hash.add("홍길동"); //기존자료구조를 덮어쓴것(중복안됨)
		System.out.println("3.크기 : "+hash.size());
		System.out.println("3.내용 : "+hash);
		System.out.println();
		
		//객체를 만들때 new를 쓰면 새로 생성이지만 hashset에서는 생성이 안되고 덮어쓰는 구조
		hash.add(new String("홍길동"));
		System.out.println("4.크기 : "+hash.size());
		System.out.println("4.내용 : "+hash);
		System.out.println();
		
		//제거(remove)
//		hash.remove(1); //에러는 안나지만 인덱스 번호가 없기 때문에 지워지지 않음
		hash.remove("홍길동"); //데이터 자료값으로 지워야함
		hash.remove("홍길동2"); // 없다고 에러는 안남 수행도한다 조심해야함  
		System.out.println("5.크기 : "+hash.size());
		System.out.println("5.내용 : "+hash);
		System.out.println();
		
		//추가란 개념이 없고 그냥 새로 넣는것
		hash.add("오하늘"); //순서구조가 아니라 몇번째에 들어갈지 모름
		System.out.println("6.크기 : "+hash.size());
		System.out.println("6.내용 : "+hash);
		System.out.println();
		
		//찾고자하는 값의 포함유무? contains()
//		System.out.println("7.'김'씨의 포함유무: "+hash.contains("김")); //전체에서 보는게 아니라 하나하나에서본다 false나옴
		System.out.println("7.'김말숙'씨의 포함유무: "+hash.contains("김말숙")); 
		System.out.println();
		
		//향상된 for문을 이용한 자료의 출력 검색도가능
		for(String name:hash) {//넘어오는 하위타입의 자료형을 사용
			System.out.print(name+"/");
		}
		System.out.println("\n");
		
		//람다식 배열(함수적 표현)
		hash.forEach(name->{
			System.out.println("값: "+name);
		});
		System.out.println();
		
		//전체삭제(clear)
		hash.clear();
		System.out.println("8.크기 : "+hash.size());
		System.out.println("8.내용 : "+hash);
		System.out.println();
		
		//비어있는지의 유무 : imEmpty()
		System.out.println("9.비어있는가"+hash.isEmpty());
		System.out.println();
		
	}
}