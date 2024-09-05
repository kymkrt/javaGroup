package t10_abstract;

public class Run {
	public static void main(String[] args) {
//		new Animal();//추상클래스는 생성할수없다
		
		Dog dog =new Dog("워우");
		dog.sound();
		System.out.println();
		
		Cat cat =new Cat();
		cat.sound();
		
	}
}
