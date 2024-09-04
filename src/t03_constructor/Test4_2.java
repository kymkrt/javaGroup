package t03_constructor;

public class Test4_2 {
	String model;
	String color="블랙";
	int speed;
	
	public Test4_2(String model) {// 1번
//		this.model=model;
//		this.color="흰색";
//		this.speed = 250;
		this(model, "흰색", 250);
	}
	
	public Test4_2(String model, String color) {// 2번
//		this.model=model;
//		this.color=color;
//		this.speed = 250;
		this(model, color, 250);

	}
	public Test4_2(String model, String color, int speed) {// 3번
		this.model=model;
		this.color=color;
		this.speed = speed;
	}
}
