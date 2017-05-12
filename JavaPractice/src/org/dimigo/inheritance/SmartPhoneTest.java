/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author 이수연
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SmartPhone a = new IPhone("IPhone7", "애플", 900000);
		System.out.println(a);
		a.turnOn();
		a.pay();
		a.useSpecialFunction(a);
		a.turnOff();
		
		SmartPhone g = new Galaxy("갤럭시 S8","삼성",800000);
		System.out.println(g);
		g.turnOn();
		g.pay();
		g.useSpecialFunction(g);
		g.turnOff();
	}
	


}
