package t04_method;

public class Test5 {
	int volume;
	
	public Test5(int volume) {
		this.volume=volume;
	}
	
	void volumeUp() {
		if(volume<10) {
			volume++;
			volumePrint();
		}
	}
	
	void volumeDown() {
		if(volume>0) {
			volume--;
			volumePrint();
		}
	}
	//볼륨 높이고 바로 부르면 된다
	void volumePrint(){
		System.out.println("현재 volume : "+this.volume);
	}
	
	
}
