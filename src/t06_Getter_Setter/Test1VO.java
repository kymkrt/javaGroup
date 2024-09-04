package t06_Getter_Setter;

public class Test1VO {
	private String name;
	private int age;
	private boolean gender;
	private String job;
	
	
	public Test1VO(String name, int age, boolean gender, String job) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.job = job;
	}

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
		if(age<1) {
			age=1;
		}else if(age>=100) {
			age=100;
		}
		this.age = age-1;
	}
	public String getGender() {
		if(gender) {
			return "남자";
		}
		return "여자";
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	
	
	
}
