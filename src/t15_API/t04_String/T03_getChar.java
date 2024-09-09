package t15_API.t04_String;

public class T03_getChar {

	public static void main(String[] args) {
		String str1 = "Hello!";
		
		char[] strArr = new char[str1.length()];
		str1.getChars(0, str1.length(), strArr, 0); // 배열복사랑 같은 개념 시작지점 끝지점 어디에 어디부터 넣을건지
		System.out.println("strArr: "+strArr); //배열의 이름을 찍어서 주소가 나옴
		System.out.println();
		
		String temp="";
		for(char str:strArr) {//strArr 배열에 있는 정보를 str에 하나씩 담는것
			temp+= str+"/";
		}
		System.out.println(temp);
		System.out.println(temp.substring(0,temp.length()-1));
	}
}
