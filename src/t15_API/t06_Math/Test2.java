package t15_API.t06_Math;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt()); //2의 32승의 정수형 난수 + -
		System.out.println(random.nextLong()); //2의 64승의 정수형 난수 + -
		System.out.println(random.nextDouble());//실수형난수
		System.out.println(random.nextFloat());//실수형난수
		System.out.println(random.nextBoolean());//논리형난수
		System.out.println();
		
		System.out.println("0~10미만의 정수: "+random.nextInt(10)); //0~9까지
		System.out.println("1~10의 정수: "+(random.nextInt(10)+1)); //1~10까지
		System.out.println("5~10의 정수: "+(random.nextInt(10+1-5)+5)); //방식은 똑같다 
		System.out.println("20~30의 정수: "+(random.nextInt(30+1-20)+20)); //방식은 똑같다 
		System.out.println();
		
		//처음부터 설정할수도 있다
		Random rnd = new Random(5); //같은 난수표에서 난수를 뽑아내는것
		for(int i =1;i<=6;i++) {
			System.out.print(rnd.nextInt(45)+1+" ");
		}
		
		
	}
}
