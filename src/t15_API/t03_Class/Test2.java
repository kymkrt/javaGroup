package t15_API.t03_Class;
// 이미지 보기 외부파일 외부파일은 무조건 트라이 캐치해야함 안그럼 에러 클래스 파일로 참조 하는법
//.은 자기자신을말함
public class Test2 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
//			객체의 정보(Test1.class) 알아내어 출력하기
			Class clazz = Test1.class;
			System.out.println("전체이름(패키지명+파일명) :"+clazz.getName());
			System.out.println("패키지명 :"+clazz.getPackage());
			System.out.println("타입명 :"+clazz.getTypeName());
			System.out.println("simple이름: "+clazz.getSimpleName());
			System.out.println();
			
			Class imgPath = Test2.class;
			System.out.println("Test2.class의 경로: "+clazz.getResource("Test2.class").getPath());
			System.out.println("Test2.class의 경로: "+imgPath.getResource("Test2.class").getPath());
			System.out.println("그림파일의 경로(1.jpg): "+imgPath.getResource("1.jpg").getPath());
			System.out.println("그림파일의 경로(11.jpg): "+imgPath.getResource("./images/11.jpg").getPath());//나 밑에 자기자신에 폴더 ./없어도 되긴함
			System.out.println("현재 작업경로의 루트(/): "+imgPath.getResource("/").getPath());
			System.out.println();
			System.out.println("패키지를 통한 경로: "+imgPath.getResource("/t15_API/t03_Class/images/12.jpg"));//첫번째 슬래시가 루트 그 다음 슬래쉬가 경로
			//맨마지막이 파일
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("String 클래스가 존재하지 않습니다"+e.getMessage());
		}
		System.out.println("작업끝");
	}
}