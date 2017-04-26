/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author 이수연
 * @version : 1.0
 */
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person a = new Person("Tom");
		Korean b = new Korean("홍길동");
		Japanese c = new Japanese("다나카");
		Chinese d = new Chinese("왕밍");
		
		System.out.println(" ");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(" ");
		
		a.sayHello();
		b.sayHello();
		c.sayHello();
		d.sayHello();
		
		System.out.println(" ");
		
		a.sayBye();
		b.sayBye();
		c.sayBye();
		d.sayBye();
		

	}

}
