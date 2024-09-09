package t15_API.t04_String;
/*
=> mutable(가변적이다) / immutable(불가변)
	String객체 : immutable 객체로서 class가 한번 생성되면 그 값을 유지. 주로 짧은 문자열처리에 적당 길이고정
	StringBuffer객체 : mutable객체로서 크기를 변경 할수 있다. 동기화를 제공 멀티스레드를 제공 및 사용하기 적절하다 가변길이문자열에 적당
	StringBuilder객체 : mutable객체로서 크기를 변경 할수 있다. 동기화가 불분명 가변길이문자열에 적당
	성능 : StringBuilder > StringBuffer >>> String
*/
public class T10_StringBuffer {

	public static void main(String[] args) {
		String str = new String("홀길동");
		System.out.println("1.str : "+str);
		
		str+="/홍길동2";
		System.out.println("2.str : "+str);
		
		//StringBuffer()객체 : 가변길이 클래스 기본크기는 16, 넘칠때는 상황에 따라 크기 변경
		//값의 추가: append, 특정위치 삽입:insert, 특정위치부터 지정개수만큼 값지우기:delete, 치환:replace
		//현재 버퍼의 크기 capacity()
		StringBuffer str2 = new StringBuffer();
		System.out.println("3.str2버퍼크기: "+str2.capacity());
		str2.append("atom");
		System.out.println("4.str2: "+str2);
		System.out.println("5.str2버퍼크기: "+str2.capacity());
		
		str2.append("0123456789012345");
		System.out.println("6.str2: "+str2);
		System.out.println("7.str2버퍼크기: "+str2.capacity());
		
		str2.insert(2, "abcdefg"); //순서 0 1 2 3 순서다
		System.out.println("8.str2: "+str2);
		System.out.println("9.str2버퍼크기: "+str2.capacity());
		
		str2.delete(5, 20);
		System.out.println("10.str2: "+str2);
		System.out.println("11.str2버퍼크기: "+str2.capacity());// 늘어난 가변길이가 줄어들지 않는다 초기화시키기전까지
		
		
		
	}
}
