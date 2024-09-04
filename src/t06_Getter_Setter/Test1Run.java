package t06_Getter_Setter;

public class Test1Run {
	public static void main(String[] args) {
		Test1VO t1=new Test1VO("홍길동",25,true,"학생");
		
		//t1.job="학생";
		
		t1.setAge(110);
		String name = t1.getName();
		String gender= t1.getGender();
		int age= t1.getAge();
		
		
		
		System.out.println("age : "+age);
		
		System.out.println(name + "님의 성별은 "+gender+"입니다");
		
	}
}
