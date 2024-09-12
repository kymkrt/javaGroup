package t18_collection.t11_ex;
//속도비교

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class T01_ListSpeedCheck {
	public static void main(String[] args) {
//		Vector<String> vos1= new Vector<String>();
//		ArrayList<String> vos2 = new ArrayList<String>();
//		LinkedList<String> vos3 = new LinkedList<String>();
		
		//데이터가 적으면 어레이 리스트가 빠르다
		
		List<String> vos1= new Vector<String>();
		List<String> vos2 = new ArrayList<String>();
		List<String> vos3 = new LinkedList<String>();
		
		int su = 1000000;
		long startTime, endTime;
		
		System.out.println("0번 인덱스에 자료추가하기 ");
		
		//vector
		startTime = System.nanoTime();
		for(int i=0;i<su;i++) {
			vos1.add(0, "홍길동"+i);//0에 계속 넣으면 알아서 뒤로 넘어감 
		}
		endTime = System.nanoTime();
		System.out.println("Vector의 수행시간?\t\t\t\t\t\t\t"+(endTime-startTime)+"ns");
		System.out.println();
		
		//ArrayList
		startTime = System.nanoTime();
		for(int i=0;i<su;i++) {
			vos2.add(0, "홍길동"+i);//0에 계속 넣으면 알아서 뒤로 넘어감 
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList의 수행시간?\t\t\t\t\t\t"+(endTime-startTime)+"ns");
		System.out.println();
		
		//LinkedList
		startTime = System.nanoTime();
		for(int i=0;i<su;i++) {
			vos3.add(0, "홍길동"+i);//0에 계속 넣으면 알아서 뒤로 넘어감 
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList의 수행시간?\t\t\t\t\t\t"+(endTime-startTime)+"ns");
		System.out.println();
		
	}
}