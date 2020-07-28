package day09;

import java.util.Arrays;

public class Ex03 {
	/*
 	1. 다섯 학생의 국어, 영어, 수학, 코딩 총점을 기억할 1차 배열을 각각 만들고
 	
 	2. 학생별로 점수를 관리할 2차 배열을 만들고
 	
 	3. 위에서 만들어진 2차배열을 과목별 점수를 관리할 2차 배열로 변환하세요.
 	
 	integer paseint 사용
 	
 	이름		: 홍길동, 고길동, 둘리, 희동이, 도우너
 	국어		:	10  ,   10  ,  10 ,  10   ,  
 	영어		:
 	수학		:
 	코딩		:
 	학생총점	:
 	
 */
	public static void main(String[] args) {
			
			int[][] no1 = new int[5][]; //다섯공간을 만든다.
			int[][] no2 = new int[6][5];
			String[][] no3 = new String[6][5];
			String[] str = new String[]{"홍길동", "고길동", "둘리", "희동이", "도우너", "과목총점"}; // 학생 채우기
			
			//2차원 배열 생성
			for(int i=0; i<no1.length; i++) {//길이:5
				no1[i] = new int[6]; //한학생의 공간에 6공간을 넣는다.
			}
			
			//배열 공간에 랜덤값 입력
			for(int i=0; i<no1.length; i++) { //5
				for(int j=0; j<no1[i].length; j++) { //6
					no1[i][j] = (int)(Math.random()*101); //0~100
						if(j==5){ //총점
							no1[i][5] = no1[i][1] + no1[i][2] + no1[i][3] + no1[i][4];
						}
						if(j==0) { //앞에이름일단 0넣기
							no1[i][0] = 0;//00,10,20,30,40,50
						}
				}
			}


			//출력
			for(int[]arr : no1) {
			System.out.println(Arrays.toString(arr)); //5by6
			}
			System.out.println(); //줄바꿈

			// 과목별 점수 위치 배정(배열 위치 변경)
			for(int i=0; i<no2.length; i++) {	//6
				for(int j=0; j<no2[i].length; j++) { //5
					no2[i][j] = no1[j][i];  //배열변경 (5,6) -> (6,5)
				}
			}
			//출력
			for(int[]arr : no2) {
				System.out.println(Arrays.toString(arr));
			}
			// 배열 문자열 변환
			for(int i=0; i<no2.length; i++) { 		//6
				for(int j=0; j<no2[i].length; j++) { 	//5
					no3[i][j] = String.valueOf(no2[i][j]); //int -> string
					if(i==0) {	//맨앞 이름 변경
						no3[0][j] = str[j]; //00, 10, 20, 30, 40, 50,
					}
				}
			}
			for(String[]arr : no3) {
				System.out.println(Arrays.toString(arr));
			}
	}
}