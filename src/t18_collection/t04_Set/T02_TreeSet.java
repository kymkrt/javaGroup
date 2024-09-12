package t18_collection.t04_Set;

import java.util.TreeSet;

/*
TreeSet: Set계열, 집합자료구조, Hashset의 역할과 같은데 차이점은 꺼낼때 자료가 자동으로 오름차순 정렬되어있다

*/
public class T02_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(5);
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(8);
		treeSet.add(15);
		
		System.out.println("1.크기 : "+treeSet.size());
		System.out.println("1.내용 : "+treeSet);
		System.out.println();
		
		System.out.println("2.first(): "+treeSet.first());//출력데이터의 첫번째 데이터 순서대로 들어간게 아니다
		System.out.println("3.first(): "+treeSet.last());//출력데이터의 마지막 데이터 순서대로 들어간게 아니다
		System.out.println("4.lower(): "+treeSet.lower(11));//검색하는 수보다 바로 작은수
		System.out.println("5.higher(): "+treeSet.higher(11));//검색하는 수보다 바로 큰수
		System.out.println("6.higher(): "+treeSet.higher(10));//검색하는 수 자체는 안나옴
	}
}