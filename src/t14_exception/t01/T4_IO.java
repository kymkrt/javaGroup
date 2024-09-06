package t14_exception.t01;

import java.io.IOException;
import java.io.InputStreamReader;

public class T4_IO {
	public static void main(String[] args) {
		//인풋이나 아웃풋에서 발생하는 익셉션
		
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			
			while(true) {
				System.out.println("업로드할 파일명을 입력하세요 (종료시 0번)");
				char ch =(char) is.read();
				if(ch=='0') break;
				int intCh = ch;
				System.out.println(ch+" : 파일을 정상적으로 읽어들였습니다 intCh = "+intCh);
			}
		} catch (IOException e) {
			System.out.println("파일 읽기 실패");
			e.printStackTrace();
		}
	System.out.println("작업종료");
	}
}