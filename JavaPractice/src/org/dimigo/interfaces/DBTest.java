/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *  |_DBTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author 이수연
 * @version : 1.0
 */
public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IDBManager oracle = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		IDBManager sybase = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		
		System.out.println("<< 변경 전 >>");
		crud(sybase);
		System.out.println();
		System.out.println("<< 변경 후 >>");
		crud(oracle);

	}
	
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
	
}
