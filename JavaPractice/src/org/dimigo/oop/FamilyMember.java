/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_FamilyMember
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 19.
 * </pre>
 *
 * @author 이수연
 * @version : 1.0
 */
public class FamilyMember {
	
	private static int memberCnt;
	private String memberName;
	
	
	public FamilyMember(String memberName) {
		memberCnt++;
		this.memberName = memberName;	
	}
	
	public String getMemberName(){
		return memberName;
	}
	
	public static void printMemberCnt(){
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}


}

	