package t19_dataBase.t03_Hoewon;

import java.util.ArrayList;
import java.util.Scanner;
//값을 받아서 화면에 뿌리는것 뷰, 프론트
public class HoewonService {
	Scanner scanner = new Scanner(System.in);
	HoewonVO vo=null;
	
	public void setInput(HoewonDAO dao) { //정보를담아만주는 역할 vo가 아니기때문
		String name,gender, joinday, address;
		int age;
		
		System.out.println("=> 회원정보 등록하기");
		while(true) {//몇번 입력받을지 몰라서 와일
			System.out.print("성명: "); name=scanner.next(); //이름 입력받자마자 중복검사해서 다시이름 받게 할수도 있다
			//동명이인 조회 조회는 늘 get
			vo=dao.getSearch(name); //위에 선언해서 그냥 vo
			if(vo.getName()==null) break;
			else
			{
				System.out.println("같은 이름이 존재합니다. 다른 이름으로 등록하세요");
			}
		}
		System.out.print("나이: "); age=scanner.nextInt();
		System.out.print("성별: "); gender=scanner.next();
		System.out.print("가입일: "); joinday=scanner.next();
		System.out.print("주소: "); address=scanner.next();
		
		//이 아래에 원래는 목록이 늘어나면 다 써야함 그걸 안하려고 VO를 쓴다
//		dao.setInput(name, age, gender, joinday, address);

//		HoewonDAO dao = new HoewonDAO(); //싱글톤 비슷한 효과를 얻기위함
		HoewonVO vo = new HoewonVO();
		//다입력받고 저장할때 중복검사를 해도 되고
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJoinday(joinday);
		vo.setAddress(address);
		
		int res=dao.setInput(vo); //하나라도 들어가면 1 아니면 0 sql문법
		if(res!=0)System.out.println("회원등록완료");
		else System.out.println("회원등록실패");
		
//		dao.connClose();
	}
	//디자인?
//dao 가지고 다녀야함 싱글톤 아니라서 
	//전체검색하여 결과를 출력
	public void getList(HoewonDAO dao) {
		ArrayList<HoewonVO> vos = dao.getList(); //vos의 하위타입 vo
//		System.out.println("vos: "+vos);
		vo=new HoewonVO();
		System.out.println("====================================================");
		System.out.println("번호\t성명\t나이\t성별\t가입일\t\t주소");
		System.out.println("====================================================");
	//몇개 올지 몰라서 와일임 근데 사실 사이즈로 찍으면 알수 있어서 그거 쓰면 된다
		for(int i=0;i<vos.size();i++) {//담을때는 할때마다 만들어야 하는데 꺼낼때 여기서는 가리킬때는 그냥 한번만 만들어서 해도 된다
			//vos가 넘어옴 근데 이걸 그냥 붙이는게 아니고 하나씩 붙여야하는데 그 한줄한줄이 vo임 그걸 vo에 담아야하니까 한줄 한줄 나눠서 담는다/ 넘어온애를 한덩어리씩 vo로 다시 나누고 끼워야함?
			vo=vos.get(i); //얕은복사 
			System.out.print(vo.getIdx()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAge()+"\t");
			System.out.print(vo.getGender()+"\t");
			System.out.print(vo.getJoinday().substring(0,10)+"\t");//데이트 타임으로 넣어서 시간까지 나오니까 그걸 빼기위해 섭스트링사용
			System.out.print(vo.getAddress()+"\n");
		}	
		System.out.println("==============================================================");
		System.out.println("\t\t총: "+vos.size()+"건");
		System.out.println("===============================================================");
	}
	//개별검색하여 결과를 출력 싱글톤아니라서 dao필요
	public int getSearch(HoewonDAO dao, String name) {
		//검색해서 결과를 받아야함 vo로 받아야함 위에 전체검색때는 여러가레 어레이 리스트 vos=(어레이 리스트 사용)사용 이건 한개라 vo 어레이리스트써도 문제는 안됨
		HoewonVO vo = dao.getSearch(name);
		
		if(vo.getName()!=null) {
			System.out.println("====================================================");
			System.out.println("번호\t성명\t나이\t성별\t가입일\t\t주소");
			System.out.println("====================================================");
			System.out.print(vo.getIdx()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAge()+"\t");
			System.out.print(vo.getGender()+"\t");
			System.out.print(vo.getJoinday().substring(0,10)+"\t");//데이트 타임으로 넣어서 시간까지 나오니까 그걸 빼기위해 섭스트링사용
			System.out.print(vo.getAddress()+"\n");
			return vo.getIdx();
		}else {
			System.out.println("검색한자료가 없습니다");
			return 0;
		}
	}
	//회원자료 삭제처리
	public void setDelete(HoewonDAO dao, String name) {
		//원래는 set게시판 딜리트 같이 쓴다
		int res =dao.setDelete(name); //지워졌는지 아닌지 체크 안되면 0 되면 1 여러번이면 숫자도 커딤
		if(res!=0) {
			System.out.println("삭제완료");
		}else {
			System.out.println("검색된 자료가 없습니다");
		}
		
	}
	//회원자료 수정
	public void setUpdate(HoewonDAO dao, String name) {
		//수정하려면 검색먼저 미리 위에 만들어둠 그냥 호출 
		int idx =getSearch(dao, name);//호출할때는 타입 필요없음
		
		//안되면 찍어봐야함 그 찍는다는뜻은 넘어온 값을 찍어보는것
//		System.out.println("idx: "+idx);
		
		if(idx!=0) {//idx가 나와야 자료가 있는거 숫자가 있어야함 
			int choice=0;
			String content="";
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			while(true) {
				System.out.print("수정할 항목 1.성명 2.나이 3.성별 4.가입일 5.주소 ==>");
				choice = scanner.nextInt();//전역변수로 선언해서 사용가능
				System.out.print("수정할 내용을 입력 ");
				content = scanner.next();
				if(choice==1) {
				//동명이인 조회 조회는 늘 get
					vo=dao.getSearch(content); //위에 선언해서 그냥 vo
					if(vo.getName()==null) break;
					else	System.out.println("같은 이름이 존재합니다. 다른 이름으로 수정하세요");
				}
			}
//			res = dao.setUpdate(choice,content);//이렇게 넘기면 안됨 뭘 바꿀지 조건where를 안보내줌
			idx = dao.setUpdate(idx,choice,content);//동명이인이 없다는 존재하에 그냥 네임을 줘도 되지만 idx를 쓰는게 좋다
			if(idx!=0) System.out.println("회원자료가 수정되었습니다");
			else System.out.println("회원자료 수정 실패");//sql문제서 삭제를 못하고 올수도 있어서 추가해줌
		}
	}

}
