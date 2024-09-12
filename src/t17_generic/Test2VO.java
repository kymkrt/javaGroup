package t17_generic;
//게터세터 만들때는 무조건 투스트링을 만들어야 한다 흘리는거 없어 확인을해야봐야기 때문 
//이 값이 정확하게 되는지 확인하게 투스트링
//이게 vo DTO의 무조건적인 있어야 할것들
//데이터 처리에 관한 객체? VO
public class Test2VO {
	private String name;
	private int age;
	private boolean gender;
	private int su;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	
	@Override
	public String toString() {
		return "Test2VO [name=" + name + ", age=" + age + ", gender=" + gender + ", su=" + su + "]";
	}
}
