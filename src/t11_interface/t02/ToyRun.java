package t11_interface.t02;

import java.util.Scanner;

public class ToyRun {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		Toy bear = new Bear();
		Toy robot = new Robot();
		Toy tank = new Tank();
		Toy airplane = new Airplane();
		
		Toy[] toy = {bear,robot,tank,airplane};
		String[] title = {"곰돌이", "로보트","탱크","비행기"};
		
		while(true) {
			System.out.println("나이를 입력해주십시요 100: 종료");
			age = sc.nextInt();
			if(age==100) {
				System.out.println("종료합니다");
				break;
			}
			else
			{
				for(int i=0;i<toy.length;i++) {
					if(toy[i].getAge()<=age) {
						toy[i].product(title[i]);
						toy[i].age(age);
						toy[i].fire();
						toy[i].monving();
						toy[i].missile();
						System.out.println();
					}
				}
			}
		}
		sc.close();
	}
}
