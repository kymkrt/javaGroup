package t50_Exercise;

public class T2Service {

	public void t2Print(T2VO vo) {
		System.out.println("==================================");
		System.out.println("가입한 회원 정보");
		System.out.println("성명 : "+vo.getName());
		System.out.println("나이 : "+vo.getAge());
		System.out.println("주소 : "+vo.getAddres());
		System.out.println("성별 : "+vo.getGender());
		
	}

}
