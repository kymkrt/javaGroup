package t10_abstract;

/*추상클래스(팀프로젝트 작업을 위한 작업지시서로서의 역할을 한느 클래스)
 * 만드는 법 클래스 앞에 abstrat를 붙인다
 * 의미 : 작업지시서로서의 역할을 한다 따라서 작업에 필요한 공통적인 사항(필드, 메소드)를 정의만 한다
 * 즉, 추상메소드만 정의할뿐 실체 내용(구현내용)은 기술하지 않는다 - 실제로 사용할 코드를 적어주는 중괄호가 없다
 * -추상클래스는 생성(new)해서 사용할수 없다 즉 실제로 사용하려면 추상클래스를 상속(extends) 받아서만 사용할수 있다(이렇게 상속받은 클래스를 실체(구현)클래스라고 한다) 
 */
public abstract class Animal {
	//public abstract String talk;//추상필드는 없다
	public String talk; //추상클래스의 필드정의는 에러는 안나지만 사용할수없다

	public Animal() {}	
	
	public abstract void sound();
	
	public void move() {
		System.out.println("걸어갑니다");
	}
	public void moving() {
		System.out.println("계속 걸어가고 있습니다");
	}
}
