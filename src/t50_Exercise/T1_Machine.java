package t50_Exercise;

public class T1_Machine {
	int money;
	String[] title = {"콜라","오렌지쥬스","커피","우유","생수"};
	int[] price = {800, 1500, 1000, 1800, 900};
	int change;
	
	public T1_Machine() {
		menu();
	}
	
	void menu() {
		System.out.println("\n* 음료 자판기 *");
		System.out.print("메뉴 : ");
		for(int i=0; i<title.length; i++) {
			System.out.print((i+1) + "." + title[i] + "(" + price[i] + ") ");
		}
	}
	
	boolean priceCheck(int no, int price) {
		if(this.price[no-1] > price) return false;
		return true;
	}
	
	void calculator(int no, int price) {
		change = price - this.price[no-1];
		orderPrint(no, price);
	}

	void orderPrint(int no, int price) {
		System.out.println("\n주문하신 " + title[no-1] + " 를 출력합니다.");
		System.out.println("입력하신 금액은 "+price+"원이고, 잔돈은 "+change+"원입니다.");
	}
	
}
