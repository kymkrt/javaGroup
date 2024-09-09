package t15_API.t01_Object;

public class Test2VORun {

	public static void main(String[] args) {
		Test2VO vo = new Test2VO();
		
		String name = "김말숙";
		int age = 25;
		boolean gender = false;
		String job = "";
		String address = "청주";
		
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJob(job);
		vo.setAddress(address);
		
		System.out.println("성명: "+vo.getName());
		System.out.println("성명: "+vo.getName().toString());
		System.out.println("나이: "+vo.getAge());
		System.out.println("성별: "+vo.isGender());
		System.out.println("직업: "+vo.getJob());
		System.out.println("주소: "+vo.getAddress());
		System.out.println();
		
		System.out.println("vo.toString: "+vo.toString());
		System.out.println("vo: "+vo);
	}
}