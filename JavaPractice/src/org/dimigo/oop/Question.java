/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *  |_Question
 *
 * 1. 개요 : My Favorite
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author 이수연
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions = {"가수", "배우", "과목"};
		String[] answers = {"엑소", "김재욱", "응용 프로그래밍"};
		
		for(int i=0; i<3; i++){
		System.out.println(i+1 +". 가장 좋아하는 " + questions[i] + "는?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		if(answer.equals(answers[i])){
			System.out.println("정답입니다!");
		} else {
			System.out.println("틀렸습니다!"); 
		}
		}
		System.out.println("<< 결과 출력 >>");
		for(int i=0;i<3;i++){
			StringBuilder sb = new StringBuilder("가장 좋아하는 " + questions[i] + "는?");
			sb.append(" ").append(answers[i]+"입니다.");
			System.out.println(sb);
		}
		
	
	}

}
