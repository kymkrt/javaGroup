package t08_inheritance;

import javax.sound.midi.Soundbank;

public class T05_C extends T05_P {
	
	@Override
	void areaCircle(int r) {
		// TODO Auto-generated method stub
		super.areaCircle(r);
	}

	@Override
	void div(int su1, int su2) {
		//super.div(su1, su2);자식메소드 사용하지 않고 부모 메소드 호출
		double res = (double)su1/su2;
		System.out.println("res : "+res);
	}
	
	
	
}
