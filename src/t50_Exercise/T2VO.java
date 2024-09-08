package t50_Exercise;

public class T2VO {
	private String name;
	private int age;
	private String address;
	private String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public boolean setAge(int age) {
		if(age<20||age>=90) { 
			System.out.println("나이의 범위를 벗어났습니다");
			return false;
		}
		else {
			this.age = age;
			return true;
			}
	}
	public String getAddres() {
		return address;
	}
	public void setAddres(String address) {
		if(address.equals("0")) this.address="외국인";
		else this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(int sex) {
		if(sex==1||sex==3) this.gender="남자";
		else this.gender="여자";
	}
	
	
}
