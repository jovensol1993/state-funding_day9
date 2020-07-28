package day09;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	친구 다섯명의 정보를 관리할 배열을 만들고 출력하세요.
 	친구의 정보는 이름, 나이, 전화번호, 메일을 저장하기로 한다.
 	
 	친구이름을 입력하면 친구의 정보를 알려주는 프로그램을 작성하세요.
 */
public class Ex05 {

	public static void main(String[] args) {
		//입력
		String str = JOptionPane.showInputDialog("which champion are you looking for? ");
		String[]str2 = new String[4]; 
		// 다섯친구 5명 정보4개
		String[][] no1 = new String[][] 
			{{"반다이크" ,"29세","4","센터백"},
			{"헨더슨" ,"30세","14","미드필더"},
			{"피르미누" ,"28세","9","미드필더"},
			{"살라" ,"28세","11","공격수"},
			{"아놀드" ,"21세","66","수비수"} 
		}; 
		//str에 값 입력된거
		for(int i=0; i<no1.length; i++) { //5
			for(int j=0; j<no1[i].length; j++) { //4 , 문자열은 equals함수
				if(j==0) {	//이름
					if(str.equals(no1[i][j])) { //j=0
						str2 = no1[i];
					}	
				}
			}
		}
		JOptionPane.showMessageDialog(null,"He is a" + Arrays.toString(str2));

		
		

		
	}
}
