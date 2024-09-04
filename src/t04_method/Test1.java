package t04_method;


public class Test1 {
	int su1;
	double su2;
	String name = "홍길동";
	
	//기본생성자
	public Test1() {}
	
	//사용자정의생성자
	Test1(int su1){
		this.su1=su1;
		System.out.println("this.su1 : "+this.su1);
	}
	void mod1() {
		
	}
	int mod2() {
		return 100;
	}
	
	void mod3(int su1){
		this.su1+=su1;
		System.out.println("this.su1 : "+this.su1);
	}
	void mod4() {
		System.out.println(name+"님 안녕하세요");
	}
	
	void mod5(String name) {
		this.name = name;
		System.out.println(this.name+"님 안녕하세요");
	}
}
