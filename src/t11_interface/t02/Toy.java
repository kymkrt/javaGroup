package t11_interface.t02;

/*
소비자가 장난감을 구매하려고한다.
각 장난감별 사용 연령대가 있다 
관점에 따라 내용들이 보이는
============================
종류 사용연령  	팔/다리	레이저발사	미사일
------------------------------------
곰돌이 제한없음  	O		X				X
로보트	8세미만 	O		O				X
탱크 	 	13세미만	X 	O				O
비행기	16세미만 	X		X				O
============================
숙졔 연령별 사용 가능한 장난감을 표시하시오
*/
public interface Toy {
	void product(String name);
	void age();
	void monving();
	void fire();
	void missile();
	
	int possibleAge();
	
	
}
