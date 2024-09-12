package t18_collection.t11_ex;

import java.util.HashSet;
import java.util.TreeSet;

public class T02_Lotto2 {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		int temp;
		
		while(true) {
//		for(int i=0;i<6;i++) { //중복된게 있으면 6번 이상으로 돌려야 하기 때무에 for문을 못씀
			temp = (int)(Math.random()*45)+1;
			lotto.add(temp);
			if(lotto.size()==6) {
				break;
			}
		}
		System.out.println("금주의 로또번호는");
		for(int su:lotto){
			System.out.print(su+"/");
		}
		
	}
}
