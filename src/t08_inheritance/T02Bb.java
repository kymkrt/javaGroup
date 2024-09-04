package t08_inheritance;
//원 처리
public class T02Bb extends T02Aa {
	
	double areaCircle(int r) {
		return r*r*Math.PI;
	}
	double lenCircle(int r) {
		return 2*Math.PI*r;
	}
}