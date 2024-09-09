package t15_API.t01_Object;

import java.util.Objects;

public class Test3 {

	public static void main(String[] args) {
		Test2VO vo = new Test2VO();
		System.out.println("vo: "+vo);
		
		if(vo==null) System.out.println("1.vo는 null 입니다");
		else System.out.println("1.vo는 null이 아닙니다");
		System.out.println();
		
		if(vo.getName()==null) System.out.println("2.vo.name은 null입니다");
		else System.out.println("2.vo.name은 null이 아닙니다");
		System.out.println();
		
		if(Objects.isNull(vo)) System.out.println("3.vo는 null 입니다");
		else System.out.println("3.vo는 null이 아닙니다");
		System.out.println();
		
		if(Objects.nonNull(vo)) System.out.println("4.vo는 null이 아닙니다");
		else System.out.println("4.vo는 null 입니다");
		System.out.println();
		
		
		if(vo.getAge()==0) System.out.println("5.vo.age은 0입니다");
		else System.out.println("5.vo.age은 0이 아닙니다");
		System.out.println();
		
//		널 오류를 없애기 위한 방법 중 하나
		
		vo.setName("홍길동");
		if((vo.getName())!=null) {
//			if(Objects.nonNull(vo.getName())) {
			System.out.println("6.vo.name: "+vo.getName());
		}
		else {
			System.out.println("성명을 입력해주세요");
		}
		System.out.println();
		
		vo.setName(null);
		System.out.println("7.name: "+vo.getName());
		
		vo.setName("김말숙");
		System.out.println("8. name: "+Objects.requireNonNull(vo.getName()));
		
	}
}
