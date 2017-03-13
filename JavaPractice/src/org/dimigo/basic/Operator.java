/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *  |_Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author 이수연
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int month=1700000, employee=3, num=1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", month) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d",employee) + "명");
		System.out.println("점포 수 : " + String.format("%,d", num) + "개");
		System.out.println("");
		System.out.println("연간 인건비 : " + String.format("%,d", (long)month*12*employee*num) + "원");

	}

}
