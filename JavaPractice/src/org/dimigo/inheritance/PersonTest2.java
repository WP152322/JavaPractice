/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_PersonTest2
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 10.
 * </pre>
 *
 * @author 이수연
 * @version : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Person[] persons = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		
		for (Person person : persons){
			System.out.println(person);
			person.sayHello();
			person.sayBye();
			System.out.println();	
		}	
	}	
	}

