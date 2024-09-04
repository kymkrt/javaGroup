package t50_Exercise;

import java.util.Scanner;

/*
'성명(name)/나이(age)/지역(address)/성별(gender)' 을 입력 받아서 고객정보를 '저장/출력'하고자 한다.
나이는 20세이상 90세미만인 사람만이 가입할수 있고
주소입력시 '외국인'은 0으로 입력한다 0이면 주소칸에 외국인이라고 출력
성별은 남자가 '1,2'여자가 '2,4'로 입력처리후 저장은 '남자/여자'로 저장처리한다
저장된 자료를 출력시켜볼수 있게 처리한다 게터세터 유효성검사 
*/
public class T2Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name, address, gender;
		int age, sex;
		
		System.out.print("성명을 입력하세요 ");
		name=sc.next();
		System.out.print("나이를 입력하세요 ");
		age=sc.nextInt();
		System.out.print("주소를 입력하세요(외국인은 0) ");
		address=sc.next();
		System.out.print("성별을 입력하세요(남자 1,3 여자 2,4) ");
		sex=sc.nextInt();
		
		T2VO vo= new T2VO();
		vo.setName(name);
		while(true) {
		boolean ageCheck = vo.setAge(age);
			if(ageCheck) break;
			else {
				System.out.print("나이를 입력하세요 ");
				age=sc.nextInt();
			}
		}
		vo.setAddres(address);
		vo.setGender(sex);
		
		T2Service service = new T2Service();
		//service.t2Print(name,age,address,sex);
		service.t2Print(vo);
		System.out.println("작업끝");
		
		sc.close();
	}
}