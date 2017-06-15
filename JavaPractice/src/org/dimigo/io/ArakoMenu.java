/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

/**
 * <pre>
 * org.dimigo.io
 *  |_ArakoMenu
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 15.
 * </pre>
 *
 * @author 이수연
 * @version : 1.0
 */
public class ArakoMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Writer writer = new BufferedWriter(new FileWriter("src/menu.txt"));
			BufferedReader reader = new BufferedReader(new FileReader("src/menu.txt"))
			){
			
			String data;
			
			while((data = br.readLine()) != null){
				writer.write(data+"\n");
			}
			writer.flush();
			System.out.println("<<메뉴 출력>>");
			String str;
			while ((str = reader.readLine()) != null) {
				System.out.println(str);
			}
			
			
			} catch(Exception e){
				e.printStackTrace();
			}

		}

	}
