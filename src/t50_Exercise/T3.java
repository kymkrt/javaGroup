package t50_Exercise;

public class T3 {
	public static void main(String[] args) {
		int tot=0;
		System.out.println("****1 ~10 까지의 합을 출력하는 프로그램 ******");
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
			tot+=i;
		}
		System.out.println("1~10까지의합은 "+tot);
	}
}
