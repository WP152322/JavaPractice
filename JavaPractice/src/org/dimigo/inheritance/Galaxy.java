/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_Galaxy
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 12.
 * </pre> 
 *
 * @author 이수연
 * @version : 1.0
 */
public class Galaxy extends SmartPhone {
	
	public Galaxy(){
		
	}
	
	public Galaxy(String model, String company, int price){
		super(model,company,price);
	}
	
	public void pay(){
		System.out.println("삼성 페이로 결제합니다.");
	}
	
	public void useWirelessCharging(){
		System.out.println("무선 충천 기능을 이용합니다.");
	}

}
