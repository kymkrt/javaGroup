package t15_API.t01_Object;

import java.util.HashMap;

//hashcode 공부
public class Test1 {
	public static void main(String[] args) {
		//HashMap : Collection FramWork의 한종류 키(key)와 값(value)으로 데이터를 표현
//	Gneric : 하위타입을 정의
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "데이터1");
		map.put(1, "데이터2");
		map.put(2, "데이터3");
		System.out.println(map);
		
		HashMap<Aa, String> map2 =new HashMap();
		map2.put(new Aa("첫번째"), "홍길동");
		map2.put(new Aa("첫번째"), "김말숙");
		map2.put(new Aa("두번째"), "이기자");
		map2.put(new Aa("두번째"), "이기자");
		System.out.println(map2);
		// 출력결과: 객체 주소(해쉬코드 hashcode)를 통한 자료의 저장/처리
//		{t15_API.Object.Aa@c038203=홍길동, t15_API.Object.Aa@55f3ddb1=이기자, t15_API.Object.Aa@cc285f4=김말숙, t15_API.Object.Aa@8bd1b6a=이기자}


	}
}

class  Aa {
	String name;
	
	public Aa(String name) {
		this.name=name;
	}
}

class Bb {
	String name;
	
	public Bb(String name) {
		this.name=name;
	}
}