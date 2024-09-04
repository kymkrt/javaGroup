package t03_constructor;

public class Test4_1 {
	String model;
	String color="블랙";
	int speed;
	
	public Test4_1(String model) {// 1번
		this.model=model;
		this.color="흰색";
		this.speed = 250;
	}
	
	public Test4_1(String model, String color) {// 2번
		this.model=model;
		this.color=color;
		this.speed = 250;
	}
	public Test4_1(String model, String color, int speed) {// 2번
		this.model=model;
		this.color=color;
		this.speed = speed;
	}
}
