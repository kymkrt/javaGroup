package t10_abstract.t1;

public class Run1 {
	public static void main(String[] args) {
		Samsung samsungPhone=new Samsung("홍길동");
		samsungPhone.powerOn();
		samsungPhone.sound();
		samsungPhone.function();
		samsungPhone.functionSamsung();
		samsungPhone.powerOff();
		System.out.println();
		Lg lgPhone=new Lg("김말숙");
		lgPhone.powerOn();
		lgPhone.sound();
		lgPhone.function();
		lgPhone.functionLg();
		lgPhone.powerOff();
		System.out.println();
		
	}
}