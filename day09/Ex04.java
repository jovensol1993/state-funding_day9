package day09;

import java.util.Arrays;

/*
 	3개의 반에 
 	5명의 학생의
 	java, oracle, html, jsp, 총점을 관리할 배열을 만들고
 	출력하세요.
 	
 	각 과목의 점수는 60~100 사이로 랜덤하게 만들어 주세요.
 	
 	
 */
public class Ex04 {
	public static void main(String[] args) {
		int[][][] no1 = new int[3][5][5]; //3반 5명학생 5개점수(총점)
		
			for(int i=0; i<no1.length; i++) { //3
				for(int j=0; j<no1[i].length; j++) { //5
					for(int k=0; k<no1[i][j].length; k++) { //5
						no1[i][j][k] = (int)((Math.random()*100-60+1)+60); //값 삽입
							if(k==4 && i==0) { //총점이라면
								no1[i][j][4] = no1[i][j][0] + no1[i][j][1]
								+ no1[i][j][2]  + no1[i][j][3];
							}
							else if(k==4 && i==1) {
								no1[i][j][4] = no1[i][j][0] + no1[i][j][1]
								+ no1[i][j][2]  + no1[i][j][3];
							}
							else if(k==4 && i==2){
								no1[i][j][4] = no1[i][j][0] + no1[i][j][1]
								+ no1[i][j][2]  + no1[i][j][3];
							} 
																//총점004 총점= 000+ 001+ 002+ 003 																
																//총점014 총점= 010+ 011+ 012+ 013
																//총점024 총점= 020+ 021+ 022+ 023
																//총점034 총점= 030+ 031+ 032+ 033
																//총점044 총점= 040+ 041+ 042+ 043 반/학생/점수
																//총점104 총점= 100+ 101+ 102+ 103  ...
					}
				}
			}
			for(int[][] arr : no1) { //출력
			System.out.println(Arrays.deepToString(arr)); //
			}
	}
}