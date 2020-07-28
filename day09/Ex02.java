package day09;

import java.util.Arrays;   

/*
 	1. 다섯 학생의 국어, 영어, 수학, 코딩 총점을 기억할 1차 배열을 각각 만들고
 	
 	2. 학생별로 점수를 관리할 2차 배열을 만들고
 	
 	3. 위에서 만들어진 2차배열을 과목별 점수를 관리할 2차 배열로 변환하세요.
 	
 	각 배열을 출력하세요.
 	
 */
public class Ex02 {

	public static void main(String[] args) {
		
		int[][] no1 = new int[5][];
		int[][] no2 = new int[5][5];
		//2차원 배열 생성
		for(int i=0; i<no1.length; i++) {
			no1[i] = new int[5];
		}
		//배열 공간에 랜덤값 입력
		for(int i=0; i<no1.length; i++) {
			for(int j=0; j<no1[i].length; j++) {
				no1[i][j] = (int)(Math.random()*101);
					if(j==4){
						no1[i][4] = no1[i][0] + no1[i][1] + no1[i][2] + no1[i][3];
					}
			}
		}


		//출력한다.
		for(int[]arr : no1) {
		System.out.println(Arrays.toString(arr));
		}
		System.out.println();

		// 과목별 점수 위치 배정(배열 위치 변경)
		for(int i=0; i<no2.length; i++) {
			for(int j=0; j<no2[i].length; j++) {
				no2[i][j] = no1[j][i];
			}
		}
		for(int[]arr : no2) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
